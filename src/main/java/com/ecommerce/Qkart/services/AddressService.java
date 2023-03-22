package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.Address;
import com.ecommerce.Qkart.repositories.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AddressService implements IAddressService {

    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void delete(Address address) {
        addressRepository.delete(address);
    }

    @Override
    public Optional<Address> findById(Integer id) {
        return addressRepository.findById(id);
    }
}
