package repository;

import model.ProductOnSale;

import java.util.List;

public interface ProductOnSaleRepository {
    List<ProductOnSale> getAllProductOnSale();
    ProductOnSale getProductOnSaleById(long id);
    int addProductOnSale(ProductOnSale productOnSale);
}
