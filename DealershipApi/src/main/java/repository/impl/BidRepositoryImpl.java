package repository.impl;

import model.Bid;
import org.springframework.beans.factory.annotation.Autowired;
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
        return List.of();
    }

    @Override
    public Bid getBidById(long id) {
        return null;
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
