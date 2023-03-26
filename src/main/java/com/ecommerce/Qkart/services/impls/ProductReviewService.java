package com.ecommerce.Qkart.services.impls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Qkart.entities.ProductReview;
import com.ecommerce.Qkart.repositories.IProductReviewRepository;
import com.ecommerce.Qkart.services.IProductReviewService;

@Service
public class ProductReviewService implements IProductReviewService {

	@Autowired
	private IProductReviewRepository productReviewRepository;

	@Override
	public ProductReview save(ProductReview productReview) {
		return productReviewRepository.save(productReview);
	}

	@Override
	public void delete(ProductReview productReview) {
		productReviewRepository.delete(productReview);
	}

	@Override
	public Optional<ProductReview> findById(String id) {
		return productReviewRepository.findById(id);
	}
}
