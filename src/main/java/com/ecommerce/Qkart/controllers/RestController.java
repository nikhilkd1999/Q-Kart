package com.ecommerce.Qkart.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/{name}")
    public ResponseEntity<String> getHomePage(@PathVariable String name) {
        return ResponseEntity.ok("Hi " + name);
    }

}
