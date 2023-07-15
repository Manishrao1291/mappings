package com.example.mappings.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinColumn(name = "fk_StudentId")
    private List<Student> studentList;
}
