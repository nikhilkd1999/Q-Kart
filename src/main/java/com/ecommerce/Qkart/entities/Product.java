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
public class Product {

	@Id
	private int productID;

	private String productImageUrl;
	private String name;
	private String description;
	private double price;
	private int quantityInStock;

	private List<ProductReview> reviews;

	// private

}
