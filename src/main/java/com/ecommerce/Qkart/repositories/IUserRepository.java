package com.ecommerce.Qkart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Qkart.entities.User;

@Repository
public interface IUserRepository extends MongoRepository<User, Integer> {
}
