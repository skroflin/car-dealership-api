package repository;

import model.Bid;

import java.util.List;

public interface BidRepository {
    List<Bid> getAllBids();
    Bid getBidById(long id);
    int addBid(Bid bid);
    int updateBid(Bid bid);
    int deleteBidById(long id);
}
