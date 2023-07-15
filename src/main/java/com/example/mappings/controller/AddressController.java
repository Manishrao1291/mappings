package com.example.mappings.controller;

import com.example.mappings.model.Address;
import com.example.mappings.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AddressController {
    
   @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return "Address added successfully";
    }

    @GetMapping("addresses")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PutMapping("updatee/{AddressId}")
    public void updateAddress(@PathVariable Long AddressId,@RequestBody Address address){
        addressService.updateAddress(AddressId,address);
    }

    @DeleteMapping("deletee/{AddressId}")
    public void deleteAddress(@PathVariable Long AddressId){
        addressService.deleteAddress(AddressId);
    }
}
