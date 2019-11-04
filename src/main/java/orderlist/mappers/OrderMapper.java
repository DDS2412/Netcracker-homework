package orderlist.mappers;

import orderlist.domains.Order;
import orderlist.dtos.OrderDto;
import orderlist.mappers.basic.MappingConfig;
import orderlist.mappers.basic.TwoWayMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {ProductMapper.class}, config = MappingConfig.class)
public interface OrderMapper extends TwoWayMapper<OrderDto, Order> {
}
