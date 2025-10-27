package controller;

import model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.BuyerRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BuyerController {
    @Autowired
    BuyerRepository buyerRepository;

    @GetMapping("/buyers")
    public List<Buyer> getAllBuyers() {
        return buyerRepository.getAllBuyers();
    }

    @GetMapping("/buyer/{id}")
    public Buyer getBuyerById(@PathVariable("id") int id) {
        return buyerRepository.getBuyerById(id);
    }

    @PostMapping("/buyer")
    public int addBuyer(@RequestBody Buyer buyer) {
        return buyerRepository.addBuyer(buyer);
    }
}
