package repository.impl;

import model.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repository.SellerRepository;

import java.util.List;

@Repository
public class SellerRepositoryImpl implements SellerRepository {

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Seller> getAllSellers() {
        return List.of();
    }

    @Override
    public Seller getSellerById(long id) {
        return null;
    }

    @Override
    public int addSeller(Seller seller) {
        return 0;
    }
}
