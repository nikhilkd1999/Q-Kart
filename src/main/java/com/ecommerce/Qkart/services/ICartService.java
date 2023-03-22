package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.Cart;

import java.util.Optional;

public interface ICartService {

    Cart save(Cart cart);

    void delete(Cart cart);

    Optional<Cart> findById(Integer id);

}
