package order.product.api.r_d_05.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "Orders")
public class Order{


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    @Column
    private String customerId;
    @Column
    private String orderDescription;
    @Column
    private String orderDate;
    @Column
    private String status;

    @ManyToMany
    @JoinTable(
            name ="OrderProduct",
            joinColumns = {@JoinColumn(name = "orderId")},
            inverseJoinColumns = {@JoinColumn(name = "productId")}
    )
    private Set<Product> products;


}
