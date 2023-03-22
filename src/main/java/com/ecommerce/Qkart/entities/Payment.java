package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Payment {

    @Id
    private int paymentID;

    @OneToOne
    private Order order;
    private String paymentMethod;

    private double amountPaid;
    private Date paymentDate;
}
