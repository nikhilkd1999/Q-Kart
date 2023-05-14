package com.ecommerce.Qkart.controllers;

import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.Qkart.entities.Cart;
import com.ecommerce.Qkart.entities.Product;
import com.ecommerce.Qkart.entities.User;
import com.ecommerce.Qkart.services.impls.CartService;
import com.ecommerce.Qkart.services.impls.ProductService;
import com.ecommerce.Qkart.services.impls.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private UserService userService;

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @ResponseBody
    @GetMapping("/hi")
    public String hi() {
        try {

            httpSession.setAttribute("userId", "nbsbjksdbjkb");

            String userId = (String) httpSession.getAttribute("userId");

            return httpSession.getId();
        } catch (Exception e) {
            // TODO: handle exception
        }

        return "Avni";
    }

    // @ResponseBody
    @PostMapping("/addToCart")
    public String addToCart(
            @RequestParam String productId, Principal principal) {

        final String email = principal.getName();

        System.out.println(email);

        Optional<User> userOptional = userService.findByEmail(email);

        if (userOptional.isEmpty()) {
            return "redirect:/products";
        }

        User user = userOptional.get();

        Cart cart = user.getCart();

        Product product = productService.findById(productId).get();

        cart.getProducts().add(product);

        cartService.save(cart);

        return "redirect:/";

    }

    @ResponseBody
    @PostMapping("/post")
    public String post(
    // @RequestParam String productId, Principal principal
    ) {
        return "redirect";
    }

}
