package com.ecommerce.Qkart.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private int productID;

    private String productImageUrl;
    private String name;
    private String description;
    private double price;
    private int quantityInStock;

    @OneToMany
    private List<ProductReview> reviews;

    // private


}
