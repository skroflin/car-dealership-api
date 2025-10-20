package repository.impl;

import model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repository.BuyerRepository;

import java.util.List;

@Repository
public class BuyerRepositoryImpl implements BuyerRepository {

    @Autowired
    JdbcTemplate template;


    @Override
    public List<Buyer> getAllBuyers() {
        String query =
                """
                select * from buyer
                """;
        List<Buyer> allBuyers = template.query(query, new BeanPropertyRowMapper<Buyer>(Buyer.class));
        return allBuyers;
    }

    @Override
    public Buyer getBuyerById(long id) {
        String query =
                """
                select * from buyer where buyer_id = ?
                """;
        Buyer buyer = template.queryForObject(query, BeanPropertyRowMapper.newInstance(Buyer.class), id);
        return buyer;
    }

    @Override
    public int addBuyer(Buyer buyer) {
        String query =
                """
                insert into buyer (buyer_first_name, buyer_last_name, phone_number, city_id) values (?, ?, ?, ?)
                """;
        return template.update(query, buyer.getBuyerFirstName(), buyer.getBuyerLastName(), buyer.getPhoneNumber(), buyer.getCityId());
    }
}
