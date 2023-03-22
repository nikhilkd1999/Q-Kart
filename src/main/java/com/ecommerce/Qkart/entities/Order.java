package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "jap_order")
public class Order {

    @Id
    private int orderID;
    @OneToOne
    private User user;
    private Date orderDate;
    private String status;

}
