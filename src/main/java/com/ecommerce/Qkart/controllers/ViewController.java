package com.ecommerce.Qkart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/")
	public String getHomePage() {
		return "home_page";
	}

}
