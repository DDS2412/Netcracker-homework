package orderlist.domains;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Data
@Accessors(chain = true)
@Table(name="reservation")
public class Order implements Identifiable<Long>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Column(name="count")
    private Integer count;

    @Override
    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return this.product;
    }

    public Order setProduct(final Product product) {
        this.product = product;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public Order setCount(final Integer count) {
        this.count = count;
        return this;
    }
}
