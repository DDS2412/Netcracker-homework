package orderlist.repositories.jpa;

import orderlist.domains.Order;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOrderRepository extends JpaRepositoryImplementation<Order, Long> {
}
