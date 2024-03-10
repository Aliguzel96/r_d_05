package order.product.api.r_d_05.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Data
@Table(name = "Products")
public class Product{

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer price;
    @Column
    private Integer stock_quantity;
    @Column
    private String created_date;

    @ManyToMany(mappedBy = "products")
    private Set<Order> orders;

}
