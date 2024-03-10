package order.product.api.r_d_05.Repository;

import order.product.api.r_d_05.dto.OrderSaveRequestDto;
import order.product.api.r_d_05.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {


}
