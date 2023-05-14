package com.ecommerce.Qkart.controllers;

import java.security.Principal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.Qkart.entities.Address;
import com.ecommerce.Qkart.entities.User;
import com.ecommerce.Qkart.services.IAddressService;
import com.ecommerce.Qkart.services.IUserService;

@Controller
public class AddressController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IAddressService addressService;

    @GetMapping("/add-address")
    public String getAddressPage() {
        return "address_page";
    }

    @PostMapping("/add-address")
    public String saveAddress(@ModelAttribute("address") Address address, Principal principal) {

        final String email = principal.getName();

        Optional<User> userOptional = userService.findByEmail(email);

        if (userOptional.isPresent()) {

            User user = userOptional.get();

            List<Address> addresses = user.getAddress();

            addresses.add(address);

            user.setAddress(addresses);

            addressService.save(address);

            userService.save(user);

        }

        return "redirect:/all-addresses";

    }

    @ResponseBody
    @GetMapping("/all-addresses")
    public List<Address> getAddress(final Principal principal) {

        String email = principal.getName();

        Optional<User> userOptional = userService.findByEmail(email);

        if (userOptional.isPresent()) {
            return userOptional.get().getAddress();
        }

        return Collections.emptyList();
    }

}
