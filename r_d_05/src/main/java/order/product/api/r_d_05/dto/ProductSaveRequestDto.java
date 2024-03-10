package order.product.api.r_d_05.dto;

import lombok.Data;

@Data
public class ProductSaveRequestDto {

    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer stock_quantity;
    private String created_date;
}
