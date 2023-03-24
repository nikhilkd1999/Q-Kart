package com.ecommerce.Qkart.entities;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

	@Id
	private int paymentID;

	private Order order;

	private double amountPaid;
	private Date paymentDate;

	private User user;
}
