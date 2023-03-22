package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.Address;

import java.util.List;
import java.util.Optional;

public interface IAddressService {

    Address save(Address address);

    void delete(Address address);

    Optional<Address> findById(Integer id);

    List<Address> getAllAddress();

}
