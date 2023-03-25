package com.ecommerce.Qkart.services;

import java.util.Optional;

import com.ecommerce.Qkart.entities.Payment;

public interface IPaymentService {
    Payment save(Payment payment);

    void delete(Payment payment);

    Optional<Payment> findById(String id);

}
