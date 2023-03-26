package com.ecommerce.Qkart.services.impls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Qkart.entities.User;
import com.ecommerce.Qkart.repositories.IUserRepository;
import com.ecommerce.Qkart.services.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public Optional<User> findById(String id) {
		return userRepository.findById(id);
	}
}
