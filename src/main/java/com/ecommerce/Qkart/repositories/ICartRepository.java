package com.ecommerce.Qkart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Qkart.entities.Cart;

@Repository
public interface ICartRepository extends MongoRepository<Cart, Integer> {
}
