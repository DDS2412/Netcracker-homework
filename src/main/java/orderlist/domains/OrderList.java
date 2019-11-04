package orderlist.domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="orders")
public class OrderList implements Identifiable<Long>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToMany(targetEntity = Order.class, cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    @Column(name="deleted")
    private Boolean isDeleted;

    @Override
    public Long getId() {
        return id;
    }

    public OrderList setId(final Long id) {
        this.id = id;
        return this;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public OrderList setOrders(final List<Order> orders) {
        this.orders = orders;
        return this;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public OrderList setIsDeleted(final Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
}
