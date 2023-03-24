package com.ecommerce.Qkart.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "qkart_user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private int userId;
    private String name;
    private String email;
    private String password;
    private String phone;

    private UserType userType;

    private List<Address> address;

    private Cart cart;

    private List<Order> orders;

}
