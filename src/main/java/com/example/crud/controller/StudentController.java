package com.example.crud.controller;


import com.example.crud.model.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

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
