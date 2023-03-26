package com.ecommerce.Qkart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Qkart.entities.Address;
import com.ecommerce.Qkart.entities.Product;
import com.ecommerce.Qkart.entities.ProductCategory;
import com.ecommerce.Qkart.entities.User;
import com.ecommerce.Qkart.repositories.ICartRepository;
import com.ecommerce.Qkart.repositories.IOrderRepository;
import com.ecommerce.Qkart.repositories.IProductRepository;
import com.ecommerce.Qkart.repositories.IProductReviewRepository;
import com.ecommerce.Qkart.repositories.IUserRepository;
import com.ecommerce.Qkart.services.IAddressService;

@RestController
public class RestControllerrrrr {

        @Autowired
        IAddressService addressService;

        @Autowired
        IUserRepository userRepository;

        @Autowired
        ICartRepository cartRepository;

        @Autowired
        IOrderRepository orderRepository;

        @Autowired
        IProductRepository productRepository;

        @Autowired
        IProductReviewRepository reviewRepository;

        @GetMapping("/{name}")
        public ResponseEntity<String> getHomePage(@PathVariable String name) {

                Address address1 = Address.builder().area("Ranipise Nagr").city("Akola")
                                .pincode("444001").house_no("6969").build();

                Address address2 = Address.builder().area("Partur Nagr").city("Partuer")
                                .pincode("444001").house_no("6969").build();

                User user = User.builder().name("Avni").email("avnipats@gmail.com")
                                .address(List.of(address1, address2)).password("pass69").phone("69696969")
                                .orders(null).cart(null)
                                .build();

                Product product = Product.builder().category(ProductCategory.ELECTRONICS).description("New Mobile")
                                .name("I-Phone 14").price(150000.0).quantityInStock(10).build();

                productRepository.save(product);

                addressService.save(address1);
                addressService.save(address2);

                userRepository.save(user);

                return ResponseEntity.ok("Hi " + name);
        }

}
