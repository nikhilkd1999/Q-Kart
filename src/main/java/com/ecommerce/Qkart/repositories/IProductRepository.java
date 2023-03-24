package com.ecommerce.Qkart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Qkart.entities.Product;

@Repository
public interface IProductRepository extends MongoRepository<Product, Integer> {
}
