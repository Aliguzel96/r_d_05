package order.product.api.r_d_05.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "OrderProduct")
public class OrderProduct{


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private Order order;

    private Integer quantity;
    private Double unitPrice;


}
