package com.ecommerce.Qkart.services.impls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Qkart.entities.Address;
import com.ecommerce.Qkart.repositories.IAddressRepository;
import com.ecommerce.Qkart.services.IAddressService;

@Service
public class AddressService implements IAddressService {

	@Autowired
	private IAddressRepository addressRepository;

	@Override
	public Address save(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public void delete(Address address) {
		addressRepository.delete(address);
	}

	@Override
	public Optional<Address> findById(String id) {
		return addressRepository.findById(id);
	}

	@Override
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}
}
