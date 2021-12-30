package com.example.crud.business;

import com.example.crud.persistence.enteties.Student;

import java.util.List;

public interface StudenService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
