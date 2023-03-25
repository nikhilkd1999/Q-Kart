package com.ecommerce.Qkart.services;

import java.util.List;
import java.util.Optional;

import com.ecommerce.Qkart.entities.Address;

public interface IAddressService {

    Address save(Address address);

    void delete(Address address);

    Optional<Address> findById(String id);

    List<Address> getAllAddress();

}
