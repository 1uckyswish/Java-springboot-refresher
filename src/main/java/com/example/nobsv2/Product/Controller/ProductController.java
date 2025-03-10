package com.example.nobsv2.Product.Controller;

import com.example.nobsv2.Product.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productRepository.findAll());
    }

   @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable Integer id) {
       return ResponseEntity.ok(productRepository.findById(id));
    }
}
