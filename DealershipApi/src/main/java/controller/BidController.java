package controller;

import model.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.BidRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BidController {
    @Autowired
    BidRepository bidRepository;

    @GetMapping("/bids")
    public List<Bid> getAllBids() {
        return bidRepository.getAllBids();
    }

    @GetMapping("/bid/{id}")
    public Bid getBidById(@PathVariable("id") int id) {
        return bidRepository.getBidById(id);
    }

    @PostMapping("/bid")
    public int addBid(@RequestBody Bid bid) {
        return bidRepository.addBid(bid);
    }

    @PutMapping("/bid")
    public int updateBid(@RequestBody Bid bid) {
        return bidRepository.updateBid(bid);
    }

    @DeleteMapping("/bid")
    public int deleteBid(@PathVariable("id") int id) {
        return bidRepository.deleteBidById(id);
    }
}
