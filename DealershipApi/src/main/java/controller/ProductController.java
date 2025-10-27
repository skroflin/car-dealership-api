package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductRepository productRepository;
}
