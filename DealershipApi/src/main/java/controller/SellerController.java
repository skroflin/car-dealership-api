package controller;

import model.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.SellerRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SellerController {
    @Autowired
    SellerRepository sellerRepository;

    @GetMapping("/sellers")
    public List<Seller> getSellers() {
        return sellerRepository.getAllSellers();
    }

    @GetMapping("/seller/{id}")
    public Seller getSeller(@PathVariable("id") int id) {
        return sellerRepository.getSellerById(id);
    }

    @PostMapping("/seller")
    public int addSeller(@RequestBody Seller seller) {
        return sellerRepository.addSeller(seller);
    }
}
