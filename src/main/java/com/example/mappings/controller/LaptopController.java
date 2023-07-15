package com.example.mappings.controller;

import com.example.mappings.model.Laptop;
import com.example.mappings.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class LaptopController {


    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop) {
        laptopService.addLaptop(laptop);
        return "Laptop Successfully Added";

    }

    @GetMapping("laptops")
    public Iterable<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @DeleteMapping("deelete/{id}")
    public String deleteLaptop(@PathVariable Integer laptopId) {
        laptopService.deleteLaptop(laptopId);
        return "Laptop Successfully Deleted";
    }

}

