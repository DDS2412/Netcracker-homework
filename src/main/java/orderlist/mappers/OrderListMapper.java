package orderlist.mappers;

import orderlist.domains.OrderList;
import orderlist.dtos.OrderListDto;
import orderlist.mappers.basic.MappingConfig;
import orderlist.mappers.basic.TwoWayMapper;
import org.mapstruct.Mapper;

@Mapper(uses = OrderMapper.class, config = MappingConfig.class)
public interface OrderListMapper extends TwoWayMapper<OrderListDto, OrderList> {
}
