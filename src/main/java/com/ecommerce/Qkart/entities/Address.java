package com.ecommerce.Qkart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    private int id;
    private String city;
    private String pincode;
    private String area;
    private String house_no;

}
