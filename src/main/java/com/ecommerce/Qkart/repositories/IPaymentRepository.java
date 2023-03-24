package com.ecommerce.Qkart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Qkart.entities.Payment;

@Repository
public interface IPaymentRepository extends MongoRepository<Payment, Integer> {
}
