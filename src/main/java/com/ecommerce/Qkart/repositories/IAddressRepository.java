package com.ecommerce.Qkart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Qkart.entities.Address;

@Repository
public interface IAddressRepository extends MongoRepository<Address, String> {
}
