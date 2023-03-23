package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    private int paymentID;

    @OneToOne
    private Order order;

    private double amountPaid;
    private Date paymentDate;

    @ManyToOne
    private User user;
}
