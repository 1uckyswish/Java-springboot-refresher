package com.example.nobsv2.Product.Model;

import jakarta.persistence.Entity;

@Entity
public class Product {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;

}
