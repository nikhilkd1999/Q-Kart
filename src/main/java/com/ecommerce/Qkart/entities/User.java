package com.ecommerce.Qkart.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Document(collection = "qkart_user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String password;
    private String phone;

    private UserType userType;

    @DocumentReference
    private List<Address> address;

    @DocumentReference
    private Cart cart;

    @DocumentReference
    private List<Order> orders;

}
