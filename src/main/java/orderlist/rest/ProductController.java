package orderlist.rest;

import orderlist.dtos.OrderListDto;
import orderlist.services.ProductService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orderlist", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@CrossOrigin(allowCredentials = "true")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/update")
    public ResponseEntity<List<OrderListDto>> update(@RequestBody OrderListDto orderListDto){
        return ResponseEntity.of(productService.updateOrder(orderListDto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderListDto>> getAllOrderLists(){
        return ResponseEntity.of(productService.getAllOrderLists());
    }

    @PostMapping("/new")
    public ResponseEntity<List<OrderListDto>> createNewOrderList(){
        return ResponseEntity.of(productService.createNewOrderList());
    }
}
