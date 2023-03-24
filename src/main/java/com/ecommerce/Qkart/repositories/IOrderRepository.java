package com.ecommerce.Qkart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Qkart.entities.Order;

@Repository
public interface IOrderRepository extends MongoRepository<Order, Integer> {
}
