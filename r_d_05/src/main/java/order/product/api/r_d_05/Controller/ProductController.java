package order.product.api.r_d_05.Controller;

import lombok.AllArgsConstructor;
import order.product.api.r_d_05.Service.ProductService;
import order.product.api.r_d_05.dto.ProductSaveRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/saveProduct")
    public void saveProduct(@RequestBody ProductSaveRequestDto product) {
        productService.saveProduct(product);
    }
}
