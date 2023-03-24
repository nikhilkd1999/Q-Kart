package com.ecommerce.Qkart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Qkart.entities.ProductReview;

@Repository
public interface IProductReviewRepository extends MongoRepository<ProductReview, Integer> {
}
