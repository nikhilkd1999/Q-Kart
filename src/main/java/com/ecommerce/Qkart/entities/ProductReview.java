package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
