package com.ecommerce.Qkart.services;

import java.util.Optional;

import com.ecommerce.Qkart.entities.User;

public interface IUserService {
    User save(User user);

    void delete(User user);

    Optional<User> findByEmail(String id);

}
