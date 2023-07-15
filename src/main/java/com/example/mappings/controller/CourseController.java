package com.example.mappings.controller;

import com.example.mappings.model.Course;
import com.example.mappings.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class CourseController {
    

    @Autowired
     CourseService courseService;

     @PostMapping("course")
     public String addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return "Course added successfully";
     }

     @GetMapping("courses")
     public Iterable<Course> getAllCourses(){
        return courseService.getAllCourses();
        }

    @DeleteMapping("deletes/{id}")
    public String deleteCourse(@PathVariable Integer courseId){
        courseService.deleteCourse(courseId);
        return "deleted";
    }
}
