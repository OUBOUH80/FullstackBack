package com.example.crud.presentation.controller;

import com.example.crud.business.BookService;
import com.example.crud.persistence.enteties.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String add(@RequestBody Book book){
        bookService.saveCourse(book);
        return "Student has been saved";
    }
    @GetMapping("getAll")
    public List<Book> getAlllStudents(){
        return bookService.getAllCourses();
    }

}
