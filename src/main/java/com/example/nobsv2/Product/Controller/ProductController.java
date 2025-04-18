package com.example.nobsv2.Product.Controller;

import com.example.nobsv2.Product.Model.Product;
import com.example.nobsv2.QueryHandlers.GetAllProductsQueryHandler;
import com.example.nobsv2.QueryHandlers.GetProductQueryHandler;
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

    @Autowired
    private GetAllProductsQueryHandler getAllProductsQueryHandler;

    @Autowired
    private GetProductQueryHandler getProductQueryHandler;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return getAllProductsQueryHandler.execute(null);
    }

   @GetMapping("/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable Integer id) {
       return getProductQueryHandler.execute(id);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody Product product){
        productRepository.save(product);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable Integer id){
        productRepository.deleteById(id);
        return ResponseEntity.ok("Product with ID " + id + " was successfully deleted.");
    }

}
