package com.example.mappings.service;

import com.example.mappings.repo.AddressRepo;
import com.example.mappings.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {


    @Autowired
     AddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public void updateAddress(Long addressId, Address address) {
        addressRepo.save(address);
    }

    public void deleteAddress(Long addressId) {
        addressRepo.deleteById(addressId);
    }
    
}
