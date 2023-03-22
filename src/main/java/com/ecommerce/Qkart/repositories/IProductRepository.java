package com.ecommerce.Qkart.repositories;

import com.ecommerce.Qkart.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
}
