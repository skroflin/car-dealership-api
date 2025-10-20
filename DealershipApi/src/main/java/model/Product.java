package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private long productId;
    private String carMark;
    private String carModel;
    private String bodyType;
    private String transmissionType;
    private long year;
}
