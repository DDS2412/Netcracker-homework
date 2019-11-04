package orderlist.services;

import orderlist.dtos.OrderListDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Optional<List<OrderListDto>> updateOrder(OrderListDto orderListDto);

    public Optional<List<OrderListDto>> getAllOrderLists();

    public Optional<List<OrderListDto>> createNewOrderList();
}
