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
        String query =
                """
                insert into 
                bids(sale_id, buyer_id, date_bid, bid_price) 
                values (?, ?, ?, ?)
                """;
        return template.update(query, bid.getSaleId(), bid.getBuyerId(), bid.getDateBid(), bid.getBidPrice());
    }

    @Override
    public int updateBid(Bid bid) {
        String query =
                """
                update bids 
                set sale_id = ?, 
                buyer_id = ?, 
                date_bid = ?, 
                bid_price = ? 
                where bid_id = ?
                """;
        return template.update(query, bid.getBidId(), bid.getSaleId(), bid.getBuyerId(), bid.getDateBid(), bid.getBidPrice());
    }

    @Override
    public int deleteBidById(long id) {
        String query =
                """
                delete from bids where bid_id = ?
                """;
        return template.update(query, id);
    }
}
