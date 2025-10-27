package controller;

import model.ProductOnSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ProductOnSaleRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductOnSaleController {
    @Autowired
    ProductOnSaleRepository productOnSaleRepository;

    @GetMapping("/productsOnSale")
    public List<ProductOnSale> getAllProductsOnSale() {
        return productOnSaleRepository.getAllProductOnSale();
    }

    @GetMapping("/productOnSale/{id}")
    public ProductOnSale getProductOnSale(@PathVariable("id") int id) {
        return productOnSaleRepository.getProductOnSaleById(id);
    }

    @PostMapping("/productsOnSale")
    public int addProductOnSale(@RequestBody ProductOnSale productOnSale) {
        return productOnSaleRepository.addProductOnSale(productOnSale);
    }
}
