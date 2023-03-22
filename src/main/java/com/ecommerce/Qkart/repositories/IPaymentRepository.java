package com.ecommerce.Qkart.repositories;

import com.ecommerce.Qkart.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Integer> {
}
