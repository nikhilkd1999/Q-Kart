package com.ecommerce.Qkart.controllers;


import com.ecommerce.Qkart.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerrrrr {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/{name}")
    public ResponseEntity<String> getHomePage(@PathVariable String name) {
        return ResponseEntity.ok("Hi " + name);
    }

}
