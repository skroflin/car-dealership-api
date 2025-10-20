package repository.impl;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repository.ProductRepository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Product> getAllProducts() {
        String query =
                """
                select * from product
                """;
        List<Product> allProducts = template.query(query, new BeanPropertyRowMapper<Product>(Product.class));
        return allProducts;
    }

    @Override
    public Product getProductById(long id) {
        String query =
                """
                select * from product where product_id = ?
                """;
        Product product = template.queryForObject(query, BeanPropertyRowMapper.newInstance(Product.class), id);
        return product;
    }

    @Override
    public int addProduct(Product product) {
        String query =
                """
                insert 
                into 
                product (car_mark, car_model, body_type, transmission_type, year) 
                values (?, ?, ?, ?, ?)
                """;
        return template.update(query, product.getCarMark(), product.getCarModel(), product.getBodyType(), product.getTransmissionType(), product.getYear());
    }
}
