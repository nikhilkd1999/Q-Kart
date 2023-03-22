package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.Payment;

import java.util.Optional;

public interface IPaymentService {
    Payment save(Payment payment);

    void delete(Payment payment);

    Optional<Payment> findById(Integer id);

}
