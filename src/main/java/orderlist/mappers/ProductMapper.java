package orderlist.mappers;

import orderlist.domains.Product;
import orderlist.dtos.ProductDto;
import orderlist.mappers.basic.MappingConfig;
import orderlist.mappers.basic.TwoWayMapper;
import org.mapstruct.Mapper;

@Mapper(config = MappingConfig.class)
public interface ProductMapper extends TwoWayMapper<ProductDto, Product> {
}
