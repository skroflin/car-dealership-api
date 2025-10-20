package repository.impl;

import model.ProductOnSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repository.ProductOnSaleRepository;

import java.util.List;

@Repository
public class ProductOnSaleRepositoryImpl implements ProductOnSaleRepository {

    @Autowired
    JdbcTemplate template;

    @Override
    public List<ProductOnSale> getAllProductOnSale() {
        return List.of();
    }

    @Override
    public ProductOnSale getProductOnSaleById(long id) {
        return null;
    }

    @Override
    public int addProductOnSale(ProductOnSale productOnSale) {
        return 0;
    }
}
