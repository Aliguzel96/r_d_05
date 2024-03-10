package order.product.api.r_d_05.Service;

import lombok.AllArgsConstructor;
import order.product.api.r_d_05.Repository.ProductRepository;
import order.product.api.r_d_05.dto.ProductSaveRequestDto;
import order.product.api.r_d_05.entity.Product;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    public void saveProduct(ProductSaveRequestDto productSaveRequestDto) {
        Product product = new Product();
        product.setId(productSaveRequestDto.getId());
        product.setName(productSaveRequestDto.getName());
        productRepository.save(product);
    }
}
