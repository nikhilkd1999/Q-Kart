package com.ecommerce.Qkart.services;

import java.util.Optional;

import com.ecommerce.Qkart.entities.Order;

public interface IOrderService {
    Order save(Order order);

    void delete(Order order);

    Optional<Order> findById(String id);

}
