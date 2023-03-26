package com.ecommerce.Qkart.services.impls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Qkart.entities.Payment;
import com.ecommerce.Qkart.repositories.IPaymentRepository;
import com.ecommerce.Qkart.services.IPaymentService;

@Service
public class PaymentService implements IPaymentService {

	@Autowired
	private IPaymentRepository paymentRepository;

	@Override
	public Payment save(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public void delete(Payment payment) {
		paymentRepository.delete(payment);
	}

	@Override
	public Optional<Payment> findById(String id) {
		return paymentRepository.findById(id);
	}
}
