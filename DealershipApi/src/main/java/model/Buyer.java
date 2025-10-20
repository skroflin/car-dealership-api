package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Buyer {
    private long buyerId;
    private String buyerFirstName;
    private String buyerLastName;
    private String phoneNumber;
    private long cityId;
}
