package com.ecommerce.Qkart.entities;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

	@Id
	private String paymentID;

	private Double amountPaid;
	private Date paymentDate;

	@DocumentReference
	private Order order;

	@DocumentReference
	private User user;
}
