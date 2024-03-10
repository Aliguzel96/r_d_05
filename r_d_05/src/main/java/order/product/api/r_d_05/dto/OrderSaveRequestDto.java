package order.product.api.r_d_05.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OrderSaveRequestDto {
    private Long productId;
    private String orderDescription;
}
