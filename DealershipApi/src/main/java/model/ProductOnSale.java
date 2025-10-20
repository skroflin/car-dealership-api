package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductOnSale {
    private long saleId;
    private long sellerId;
    private long productId;
    private long price;
    private boolean isNegotiable;
    private LocalDateTime date;
}
