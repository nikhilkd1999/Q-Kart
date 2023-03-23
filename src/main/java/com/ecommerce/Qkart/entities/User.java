package com.ecommerce.Qkart.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jpa_user")
public class User {
    @Id
    private int userId;
    private String name;
    private String email;
    private String password;
    private UserType userType;

    @OneToMany
    private List<Address> address;
    private String phone;

    @OneToOne
    private Cart cart;

    @OneToMany
    private List<Order> orders;

}
