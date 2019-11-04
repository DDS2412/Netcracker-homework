package orderlist.dtos;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import orderlist.domains.Identifiable;
import orderlist.domains.OrderList;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
@FieldNameConstants
public class OrderListDto implements Identifiable<Long>  {
    private Long id;

    private Boolean isDeleted;

    private List<OrderDto> orders = new ArrayList<>();

    public OrderListDto setId(final Long id) {
        this.id = id;
        return this;
    }

    @Override
    public Long getId() {
        return id;
    }
}
