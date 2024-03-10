package order.product.api.r_d_05.Controller;

import lombok.AllArgsConstructor;
import order.product.api.r_d_05.Service.OrderService;
import order.product.api.r_d_05.Service.ProductService;
import order.product.api.r_d_05.dto.OrderSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    @PostMapping("/saveOrder")
    public void save(@RequestBody OrderSaveRequestDto orderSaveRequestDto) {
        orderService.save(orderSaveRequestDto);
    }
}
