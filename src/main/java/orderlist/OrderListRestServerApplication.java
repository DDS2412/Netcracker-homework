package orderlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class OrderListRestServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderListRestServerApplication.class, args);
    }
}
