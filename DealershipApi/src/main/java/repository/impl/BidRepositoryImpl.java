package repository.impl;

import model.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repository.BidRepository;

import java.util.List;

@Repository
public class BidRepositoryImpl implements BidRepository {

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Bid> getAllBids() {
        String query =
                """
                select * from bids
                """;
        List<Bid> allBids = template.query(query, new BeanPropertyRowMapper<Bid>(Bid.class));
        return allBids;
    }

    @Override
    public Bid getBidById(long id) {
        String query =
                """
                select * from bids where bid_id = ?
                """;
        Bid bid = template.queryForObject(query, BeanPropertyRowMapper.newInstance(Bid.class), id);
        return bid;
    }

    @Override
    public int addBid(Bid bid) {
        return 0;
    }

    @Override
    public int updateBid(Bid bid) {
        return 0;
    }

    @Override
    public int deleteBidById(long id) {
        return 0;
    }
}
