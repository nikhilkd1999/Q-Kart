package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Order {

    @Id
    private int orderID;
    @OneToOne
    private User user;
    private Date orderDate;
    private String status;

}
