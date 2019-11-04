package orderlist.services.impl;

import orderlist.domains.Order;
import orderlist.domains.OrderList;
import orderlist.domains.Product;
import orderlist.dtos.OrderListDto;
import orderlist.mappers.OrderListMapper;
import orderlist.mappers.OrderMapper;
import orderlist.mappers.ProductMapper;
import orderlist.repositories.jpa.JpaOrderListRepository;
import orderlist.repositories.jpa.JpaOrderRepository;
import orderlist.repositories.jpa.JpaProductRepository;
import orderlist.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private final JpaProductRepository productRepository;

    private final JpaOrderListRepository orderListRepository;

    private final JpaOrderRepository orderRepository;

    private final OrderListMapper orderListMapper;

    private final OrderMapper orderMapper;

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(JpaProductRepository productRepository,
                              JpaOrderListRepository orderListRepository,
                              JpaOrderRepository orderRepository,
                              OrderListMapper orderListMapper,
                              OrderMapper orderMapper,
                              ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.orderListRepository = orderListRepository;
        this.orderRepository = orderRepository;
        this.orderListMapper = orderListMapper;
        this.orderMapper = orderMapper;
        this.productMapper = productMapper;
    }

    @Override
    public Optional<List<OrderListDto>> getAllOrderLists() {
        return Optional.of(orderListRepository
                .findByIsDeleted(false).stream()
                .map(orderListMapper::toDto)
                .collect(Collectors.toList()));
    }

    @Override
    public Optional<List<OrderListDto>> updateOrder(OrderListDto orderListDto) {
        OrderList orderListAfterUpdate = orderListMapper.toEntity(orderListDto);
        Optional<OrderList> orderListBeforeUpdate = orderListRepository.findById(orderListAfterUpdate.getId());
        orderListBeforeUpdate
                .ifPresent(
                        orderList-> orderListRepository
                                .save(orderListMapper.updateEntity(orderList, orderListDto)));

        return getAllOrderLists();
    }

    @Override
    public Optional<List<OrderListDto>> createNewOrderList() {
        orderListRepository.save(createEmptyOrderList());
        return getAllOrderLists();
    }

    private OrderList createEmptyOrderList(){
        OrderList orderList = new OrderList().setIsDeleted(false);
        List<Product> products = productRepository.findAll();
        List<Order> orders = products
                                .stream()
                                .map(product -> new Order().setProduct(product).setCount(0))
                                .collect(Collectors.toList());

        return orderList.setOrders(orders);
    }
}
