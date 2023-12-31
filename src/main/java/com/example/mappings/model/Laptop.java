package com.example.mappings.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "fk_studentId")
    private Student student;

}
