package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.Order;

import java.util.Optional;

public interface IOrderService {
    Order save(Order order);

    void delete(Order order);

    Optional<Order> findById(Integer id);

}
