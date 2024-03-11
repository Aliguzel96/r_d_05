package order.product.api.r_d_05.Service;

import lombok.AllArgsConstructor;
import order.product.api.r_d_05.Repository.OrderProductRepository;
import order.product.api.r_d_05.Repository.OrderRepository;
import order.product.api.r_d_05.Repository.ProductRepository;
import order.product.api.r_d_05.dto.OrderSaveRequestDto;
import order.product.api.r_d_05.entity.Order;
import order.product.api.r_d_05.entity.OrderProduct;
import order.product.api.r_d_05.entity.Product;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final OrderProductRepository orderProductRepository;

    public void save(OrderSaveRequestDto orderSaveRequestDto) {

        Long productId = orderSaveRequestDto.getProductId();
        String orderDescription = orderSaveRequestDto.getOrderDescription();

        Order order = new Order();
        order.setOrderDescription(orderDescription);
        orderRepository.save(order);

        Product product = productRepository.findById(productId).get();

        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setOrder(order);
        orderProduct.setProduct(product);

        orderProductRepository.save(orderProduct);
    }

    public void delete(Long orderID) {

        Order order = new Order();
        order.setId(orderID);

        orderRepository.delete(order);
    }
}
