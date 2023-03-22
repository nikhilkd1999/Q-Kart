package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cart {

    @Id
    private int id;

    @OneToMany
    private List<Product> products;

    @OneToOne
    private User user;
}
