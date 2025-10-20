package repository;

import model.Seller;

import java.util.List;

public interface SellerRepository {
    List<Seller> getAllSellers();
    Seller getSellerById(long id);
    int addSeller(Seller seller);
}
