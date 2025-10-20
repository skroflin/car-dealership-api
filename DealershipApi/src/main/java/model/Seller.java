package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Seller {
    private long sellerId;
    private String sellerFirstName;
    private String sellerLastName;
    private String phoneNumber;
    private long cityId;
}
