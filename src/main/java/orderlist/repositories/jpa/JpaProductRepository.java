package orderlist.repositories.jpa;

import orderlist.domains.Product;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepositoryImplementation<Product, Long> { }
