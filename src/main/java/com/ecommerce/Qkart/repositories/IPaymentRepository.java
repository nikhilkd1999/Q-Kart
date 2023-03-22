package com.ecommerce.Qkart.repositories;

import com.ecommerce.Qkart.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentRepository extends JpaRepository<Payment, Integer> {
}
