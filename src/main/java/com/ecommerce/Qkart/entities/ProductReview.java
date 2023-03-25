package com.ecommerce.Qkart.entities;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Document
@Builder

@AllArgsConstructor
public class ProductReview {

	@Id
	private String id;

	private Double rating;
	private String reviewText;
	private Date reviewDate;

	@DocumentReference
	private final User user;

}
