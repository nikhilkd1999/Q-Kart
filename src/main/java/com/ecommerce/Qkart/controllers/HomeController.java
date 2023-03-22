package com.ecommerce.Qkart.controllers;


import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> getHomePage(){
        return ResponseEntity.ok("home_page");
    }


}
