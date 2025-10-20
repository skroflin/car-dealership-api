package repository.impl;

import model.ProductOnSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String query =
                """
                select * from product_on_sale
                """;
        List<ProductOnSale> allProductsOnSale = template.query(query, new BeanPropertyRowMapper<ProductOnSale>(ProductOnSale.class));
        return allProductsOnSale;
    }

    @Override
    public ProductOnSale getProductOnSaleById(long id) {
        String query =
                """
                select * from product_on_sale where sale_id = ?
                """;
        ProductOnSale product = template.queryForObject(query, new BeanPropertyRowMapper<ProductOnSale>(ProductOnSale.class));
        return product;
    }

    @Override
    public int addProductOnSale(ProductOnSale productOnSale) {
        String query =
                """
                insert 
                into 
                product_on_sale (seller_id, product_id, price, is_negiotable, date_post) 
                values (?, ?, ?, ?, ?, ?)
                """;
        return template.update(query, productOnSale.getSellerId(), productOnSale.getProductId(), productOnSale.getPrice(), productOnSale.isNegotiable(), productOnSale.getDate());
    }
}
