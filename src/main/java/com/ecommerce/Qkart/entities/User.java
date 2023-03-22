package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private int UserID;
    private String name;
    private String email;
    private String password;

    @ManyToOne
    private Address address;
    private String phone;

//  add_to_cart() : void
//  +place_order() : void
//  +write_review() : void

}
