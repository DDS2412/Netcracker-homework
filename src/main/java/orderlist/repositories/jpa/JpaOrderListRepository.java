package orderlist.repositories.jpa;

import orderlist.domains.OrderList;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaOrderListRepository extends JpaRepositoryImplementation<OrderList, Long> {
    List<OrderList> findByIsDeleted(Boolean isDeleted);
}
