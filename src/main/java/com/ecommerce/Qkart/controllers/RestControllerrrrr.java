package com.ecommerce.Qkart.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerrrrr {

    

    @GetMapping("/{name}")
    public ResponseEntity<String> getHomePage(@PathVariable String name) {
        return ResponseEntity.ok("Hi " + name);
    }

}
