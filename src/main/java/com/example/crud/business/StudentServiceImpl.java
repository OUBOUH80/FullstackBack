package com.example.crud.business;


import com.example.crud.persistence.enteties.Student;
import com.example.crud.persistence.mapping.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public  class StudentServiceImpl implements StudenService  {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student) ;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
