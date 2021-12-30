package com.example.crud.presentation.controller;

import com.example.crud.business.CourseService;
import com.example.crud.persistence.enteties.Course;
import com.example.crud.persistence.enteties.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public String add(@RequestBody Course course){
        courseService.saveCourse(course);
        return "Student has been saved";
    }
    @GetMapping("getAll")
    public List<Course> getAlllStudents(){
        return courseService.getAllCourses();
    }

}
