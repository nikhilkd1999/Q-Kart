package com.ecommerce.Qkart.repositories;

import com.ecommerce.Qkart.entities.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductReviewRepository extends JpaRepository<ProductReview, Integer> {
}
