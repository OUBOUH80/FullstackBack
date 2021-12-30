package com.example.crud.business;

import com.example.crud.persistence.enteties.Course;
import com.example.crud.persistence.mapping.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceIml implements CourseService{

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course) ;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll() ;
    }
}
