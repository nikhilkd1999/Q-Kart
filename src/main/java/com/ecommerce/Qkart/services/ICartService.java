package com.ecommerce.Qkart.services;

import java.util.Optional;

import com.ecommerce.Qkart.entities.Cart;

public interface ICartService {

    Cart save(Cart cart);

    void delete(Cart cart);

    Optional<Cart> findById(String id);

}
