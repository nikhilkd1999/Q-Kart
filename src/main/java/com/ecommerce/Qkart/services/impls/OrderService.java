package com.ecommerce.Qkart.services.impls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Qkart.entities.Order;
import com.ecommerce.Qkart.repositories.IOrderRepository;
import com.ecommerce.Qkart.services.IOrderService;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private IOrderRepository orderRepository;

	@Override
	public Order save(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public void delete(Order order) {
		orderRepository.delete(order);
	}

	@Override
	public Optional<Order> findById(String id) {
		return orderRepository.findById(id);
	}
}
