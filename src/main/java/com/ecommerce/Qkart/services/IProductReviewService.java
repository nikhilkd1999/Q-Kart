package com.ecommerce.Qkart.services;

import java.util.Optional;

import com.ecommerce.Qkart.entities.ProductReview;

public interface IProductReviewService {
    ProductReview save(ProductReview productReview);

    void delete(ProductReview productReview);

    Optional<ProductReview> findById(String id);

}
