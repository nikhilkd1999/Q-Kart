package com.ecommerce.Qkart.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Qkart.entities.Product;
import com.ecommerce.Qkart.services.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {

		return ResponseEntity.ok(productService.findAll());

	}

	@GetMapping("/products/{productID}")
	public ResponseEntity<Product> getProduct(@PathVariable(name = "productID") String productId) {

		final Optional<Product> productOptional = productService.findById(productId);

		if (productOptional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(productOptional.get());

	}

}