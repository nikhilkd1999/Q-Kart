package com.ecommerce.Qkart.controllers;

import com.ecommerce.Qkart.entities.Product;
import com.ecommerce.Qkart.services.ICartService;
import com.ecommerce.Qkart.services.IProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Log4j2
@Controller
public class ProductController {

	@Autowired
	private ICartService cartService;

	@Autowired
	private IProductService productService;

	@ResponseBody
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {

		return ResponseEntity.ok(productService.findAll());

	}

	@GetMapping("/products/{productId}")
	public String getProduct(@PathVariable(name = "productId") String productId, Model model) {

		final Optional<Product> productOptional = productService.findById(productId);

		if (productOptional.isEmpty()) {
			final String errorMessage = "Product with ID " + productId + " not found";
			model.addAttribute("errorMessage", errorMessage);
			return "error"; // return the error page
		}

		Product product = productOptional.get();
		model.addAttribute("product", product);
		return "product"; // return the product details page
	}

	@ResponseBody
	@PutMapping("/addToCart")
	public ResponseEntity<String> addToCart(@RequestParam String productId) {

		return ResponseEntity.ok("added");
	}

}