package com.ecommerce.Qkart.services;

import com.ecommerce.Qkart.entities.ProductReview;

import java.util.Optional;

public interface IProductReviewService {
    ProductReview save(ProductReview productReview);

    void delete(ProductReview productReview);

    Optional<ProductReview> findById(Integer id);

}
