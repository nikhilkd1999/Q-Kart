package com.ecommerce.Qkart.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Document
@AllArgsConstructor
public class Product {

	@Id
	private String productId;

	private String name;
	private String description;
	private Double price;
	private String productImageUrl;
	private Integer quantityInStock;

	private ProductCategory category;

	@DocumentReference
	private List<ProductReview> reviews;

	public Product() {
		this.reviews = new ArrayList<>();
	}

}
