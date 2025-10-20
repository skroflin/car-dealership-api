package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bid {
    private long bidId;
    private long saleId;
    private long buyerId;
    private LocalDate dateBid;
    private long bidPrice;
}
