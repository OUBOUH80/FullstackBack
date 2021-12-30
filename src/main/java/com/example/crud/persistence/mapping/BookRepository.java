package com.example.crud.persistence.mapping;

import com.example.crud.persistence.enteties.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
