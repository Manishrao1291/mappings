package com.example.mappings.service;

import com.example.mappings.repo.StudentRepo;
import com.example.mappings.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
    }
    
}
