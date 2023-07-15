package com.example.mappings.service;

import com.example.mappings.repo.CourseRepo;
import com.example.mappings.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;



    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public Iterable<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public void deleteCourse(Integer courseId) {
        courseRepo.deleteById(courseId);
    }
    
}
