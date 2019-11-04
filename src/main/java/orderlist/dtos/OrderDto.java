package orderlist.dtos;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import orderlist.domains.OrderList;
import orderlist.domains.Product;

@Data
@Accessors(chain = true)
@FieldNameConstants
public class OrderDto {
    private Long id;

    private ProductDto product;

    private Integer count;
}
