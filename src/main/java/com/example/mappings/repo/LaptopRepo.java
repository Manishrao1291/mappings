package com.example.mappings.repo;


import com.example.mappings.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Integer>{

    Laptop findByLaptopId(Integer id);
    
}
