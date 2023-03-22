package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.Product;

import java.util.Optional;

public interface IProductService {
    Product save(Product product);

    void delete(Product product);

    Optional<Product> findById(Integer id);

}
