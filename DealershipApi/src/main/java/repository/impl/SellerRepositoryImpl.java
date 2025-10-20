package repository.impl;

import model.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String query =
                """
                select * from seller
                """;
        List<Seller> allSellers = template.query(query, new BeanPropertyRowMapper<Seller>(Seller.class));
        return allSellers;
    }

    @Override
    public Seller getSellerById(long id) {
        String query =
                """
                select * from seller where seller_id = ?
                """;
        Seller seller = template.queryForObject(query, BeanPropertyRowMapper.newInstance(Seller.class), id);
        return seller;
    }

    @Override
    public int addSeller(Seller seller) {
        String query =
                """
                insert into seller (seller_first_name, seller_last_name, phone_number, city_id) values (?, ?, ?, ?)
                """;
        return template.update(query, seller.getSellerFirstName(),  seller.getSellerLastName(), seller.getPhoneNumber(), seller.getCityId());
    }
}
