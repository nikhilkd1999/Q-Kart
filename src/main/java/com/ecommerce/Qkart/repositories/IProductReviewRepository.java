package com.ecommerce.Qkart.repositories;

import com.ecommerce.Qkart.entities.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductReviewRepository extends JpaRepository<ProductReview, Integer> {
}
