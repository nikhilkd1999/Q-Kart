package com.ecommerce.Qkart.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	private int id;
	private String city;
	private String pincode;
	private String area;
	private String house_no;

}
