package com.example.crud.business;

import com.example.crud.persistence.enteties.Course;
import com.example.crud.persistence.enteties.Student;

import java.util.List;

public interface CourseService {
    public Course saveCourse(Course course);
    public List<Course> getAllCourses();
}
