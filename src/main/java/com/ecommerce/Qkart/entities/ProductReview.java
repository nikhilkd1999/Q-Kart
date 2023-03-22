package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class ProductReview {

    @Id
    private int reviewID;

    @OneToOne
    private User user;

    @OneToOne
    private Product product;
    private double rating;
    private String reviewText;
    private Date reviewDate;

}
