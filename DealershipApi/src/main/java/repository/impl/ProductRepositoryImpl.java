package repository.impl;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
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
        return List.of();
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public int addProduct(Product product) {
        return 0;
    }
}
