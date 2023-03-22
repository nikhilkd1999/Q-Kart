package com.ecommerce.Qkart.repositories;

import com.ecommerce.Qkart.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
