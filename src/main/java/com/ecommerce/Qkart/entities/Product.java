package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    private String productImage;
    private String name;
    private String description;
    private double price;
    private int quantityInStock;


}
