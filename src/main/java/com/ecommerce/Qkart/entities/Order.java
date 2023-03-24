package com.ecommerce.Qkart.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "qkart_order")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	private int orderID;

	private List<Product> orderedProducts;
	private Date orderDate;

	private Address address;

}
