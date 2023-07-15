package com.example.mappings.service;

import com.example.mappings.repo.LaptopRepo;
import com.example.mappings.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LaptopService {

    @Autowired
    LaptopRepo laptopRepo;

    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);

    }

    public Iterable<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public void deleteLaptop(Integer laptopId) {
        laptopRepo.deleteById(laptopId);
    }

    public Laptop getLaptopById(Integer id) {
        return laptopRepo.findByLaptopId(id);
        
    }

    public Laptop updateLaptop(Laptop laptop) {
        return laptopRepo.save(laptop);
    }
    
}
