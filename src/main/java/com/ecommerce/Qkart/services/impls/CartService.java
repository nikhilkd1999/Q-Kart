package com.ecommerce.Qkart.services.impls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Qkart.entities.Cart;
import com.ecommerce.Qkart.repositories.ICartRepository;
import com.ecommerce.Qkart.services.ICartService;

@Service
public class CartService implements ICartService {

	@Autowired
	ICartRepository cartRepository;

	@Override
	public Cart save(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public void delete(Cart cart) {
		cartRepository.delete(cart);
	}

	@Override
	public Optional<Cart> findById(String id) {
		return cartRepository.findById(id);
	}
}
