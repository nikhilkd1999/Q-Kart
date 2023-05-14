package com.ecommerce.Qkart;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecommerce.Qkart.entities.Address;
import com.ecommerce.Qkart.entities.Product;
import com.ecommerce.Qkart.entities.ProductCategory;
import com.ecommerce.Qkart.entities.User;
import com.ecommerce.Qkart.repositories.IAddressRepository;
import com.ecommerce.Qkart.repositories.IProductRepository;
import com.ecommerce.Qkart.repositories.IUserRepository;

@Component
public class PopulateDummyData implements CommandLineRunner {

    @Autowired
    private IAddressRepository addressRepository;

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // productRepository.deleteAll();
        // addressRepository.deleteAll();
        // userRepository.deleteAll();
        // initData();
    }

    private void initData() {
        Address address1 = Address.builder()
                .area("Used to be in my heart")
                .house_no("69")
                .build();

        Address address2 = Address.builder()
                .area("Park Avenue Society")
                .city("Pune")
                .pincode("444001")
                .house_no("69")
                .build();

        addressRepository.saveAll(Arrays.asList(address1, address2));

        User user = User.builder()
                .name("Avni")
                .email("avnipats@gmail.com")
                .password("Nikhil")
                .phone("69696969")
                .address(Arrays.asList(address1, address2))
                .build();
        userRepository.save(user);

        Product product1 = Product.builder()
                .name("Samsung Galaxy S21")
                .description("Flagship Android smartphone")
                .category(ProductCategory.ELECTRONICS)
                .price(999.0)
                .quantityInStock(20)
                .productImageUrl(
                        "https://m.media-amazon.com/images/I/71qZERyxy6L._SX679_.jpg")
                .build();

        Product product2 = Product.builder()
                .name("Apple MacBook Pro")
                .description("High-performance laptop for professionals")
                .category(ProductCategory.ELECTRONICS)
                .price(2499.0)
                .quantityInStock(5)
                .productImageUrl(
                        "https://m.media-amazon.com/images/I/61LNGJEMh0L._SX679_.jpg")
                .build();

        Product product3 = Product.builder()
                .name("Nike Air Zoom Pegasus 38")
                .description("Running shoes for men")
                .category(ProductCategory.SPORTS)
                .price(129.0)
                .quantityInStock(30)
                .productImageUrl(
                        "https://m.media-amazon.com/images/I/51jTWpJXc7S._AC_UL480_FMwebp_QL65_.jpg")
                .build();

        productRepository.saveAll(List.of(product1, product2, product3));

    }
}
