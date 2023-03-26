package com.ecommerce.Qkart.services;

import java.util.List;
import java.util.Optional;

import com.ecommerce.Qkart.entities.Product;

public interface IProductService {
	Product save(Product product);

	void delete(Product product);

	Optional<Product> findById(String id);

	List<Product> findAll();

}
