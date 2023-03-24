package com.ecommerce.Qkart.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

	@Id
	private int id;

	private List<Product> products;

	private double cartValue;

	// @OneToOne
	// private User user;
}
