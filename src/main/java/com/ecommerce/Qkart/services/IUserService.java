package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.User;

import java.util.Optional;

public interface IUserService {
    User save(User user);

    void delete(User user);

    Optional<User> findById(Integer id);

}
