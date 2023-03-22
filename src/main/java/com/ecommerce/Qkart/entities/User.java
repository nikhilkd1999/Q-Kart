package com.ecommerce.Qkart.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "jpa_user")
public class User {
    @Id
    private int userId;
    private String name;
    private String email;
    private String password;

    @OneToMany
    private List<Address> address;
    private String phone;

    @OneToOne
    private Cart cart;

}
