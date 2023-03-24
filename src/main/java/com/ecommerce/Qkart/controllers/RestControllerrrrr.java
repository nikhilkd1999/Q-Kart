package com.ecommerce.Qkart.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Qkart.entities.Address;
import com.ecommerce.Qkart.repositories.IAddressRepository;

@RestController
public class RestControllerrrrr {

    @Autowired
    IAddressRepository addressRepository;

    @GetMapping("/{name}")
    public ResponseEntity<String> getHomePage(@PathVariable String name) {

        int r = (int)(Math.random() * 10000);

        Address address = new Address(r, "Akola", "444001", "Ranpise Nagar", "12345");

        addressRepository.save(address);


        return ResponseEntity.ok("Hi " + name);
    }

}
