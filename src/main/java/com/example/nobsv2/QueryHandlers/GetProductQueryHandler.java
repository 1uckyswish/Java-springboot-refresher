package com.example.nobsv2.QueryHandlers;

import com.example.nobsv2.Product.Controller.ProductRepository;
import com.example.nobsv2.Product.Model.ApiResponse;
import com.example.nobsv2.Product.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetProductQueryHandler implements Query<Integer, Object> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<Object> execute(Integer id) {
        Optional<Product> productById = productRepository.findById(id);

        if (productById.isEmpty()) {
            // Return structured error response
            ApiResponse apiResponse = new ApiResponse(
                    "404",                // status
                    "Not Found",          // error
                    "Product with ID " + id + " not found." // message
            );
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiResponse);
        }

        return ResponseEntity.ok(productById.get());
    }
}