package repository;

import model.Buyer;
import java.util.List;

public interface BuyerRepository{
    List<Buyer> getAllBuyers();
    Buyer getBuyerById(long id);
    int addBuyer(Buyer buyer);
}
