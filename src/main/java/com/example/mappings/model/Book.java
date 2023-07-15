package com.example.mappings.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    @JoinColumn(name = "fk_student-id")
    private Student student;
}
