package com.ecommerce.Qkart.entities;

import java.sql.Date;
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
@Document(collection = "qkart_order")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	private String orderID;

	private Date orderDate;

	@DocumentReference
	private List<Product> orderedProducts;

	@DocumentReference
	private Address address;

}
