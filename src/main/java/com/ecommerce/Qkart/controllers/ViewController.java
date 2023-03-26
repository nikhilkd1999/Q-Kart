package com.ecommerce.Qkart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.Qkart.entities.Product;
import com.ecommerce.Qkart.services.IProductService;

@Controller
public class ViewController {

	@Autowired
	private IProductService productService;

	@GetMapping("/")
    public String home(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "home_page";
    }

}
