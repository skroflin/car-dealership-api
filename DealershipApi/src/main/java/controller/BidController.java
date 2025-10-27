package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.BidRepository;

@RestController
@RequestMapping("/api")
public class BidController {
    @Autowired
    BidRepository bidRepository;
}
