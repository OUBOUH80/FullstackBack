package com.example.crud.presentation.controller;


import com.example.crud.business.StudentService;
import com.example.crud.persistence.enteties.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Add student
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student has been saved";
    }
    @GetMapping("getAll")
    public List<Student> getAlllStudents(){
        return studentService.getAllStudents();
    }

}
