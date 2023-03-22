package com.ecommerce.Qkart.repositories;

import com.ecommerce.Qkart.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {
}
