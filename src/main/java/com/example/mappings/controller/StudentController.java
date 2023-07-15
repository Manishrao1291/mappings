package com.example.mappings.controller;

import com.example.mappings.model.Student;
import com.example.mappings.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {
    

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "success";
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
        }

    @DeleteMapping("ddelete/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return "success deleted...";
        }



}
