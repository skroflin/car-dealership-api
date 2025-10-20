package repository;

import model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(long id);
    int addProduct(Product product);
}
