package com.example.nobsv2.Product.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity getProduct() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
    }
}








//    @Autowired
//   private CreatedProductService createdProductService;
//
//    @PostMapping
//    public ResponseEntity<String> createProduct() {
//        return createdProductService.excute();
//    }
//
//    @GetMapping
//    public ResponseEntity<String> getProduct() {
//        return ResponseEntity.status(HttpStatus.OK).body("Product found");
//    }
//
//    @PutMapping
//    public ResponseEntity<String> updateProduct() {
//        return ResponseEntity.status(HttpStatus.OK).body("Product updated");
//    }
//
//    @DeleteMapping
//    public ResponseEntity<String> deleteProduct() {
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product deleted");
//    }
