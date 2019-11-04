package orderlist.dtos;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Column;

@Data
@Accessors(chain = true)
@FieldNameConstants
public class ProductDto {
    private Long id;

    private String name;

    private Double price;
}
