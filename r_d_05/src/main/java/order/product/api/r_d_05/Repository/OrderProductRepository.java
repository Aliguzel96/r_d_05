package order.product.api.r_d_05.Repository;

import order.product.api.r_d_05.entity.OrderProduct;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, Long> {
}
