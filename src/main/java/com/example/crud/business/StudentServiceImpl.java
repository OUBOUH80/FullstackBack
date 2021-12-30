package com.example.crud.business;


import com.example.crud.persistence.enteties.Student;
import com.example.crud.persistence.mapping.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public  class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student) ;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
