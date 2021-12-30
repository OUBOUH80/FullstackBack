package com.example.crud.business;

import com.example.crud.persistence.enteties.Book;

import java.util.List;

public interface BookService {
    public Book saveCourse(Book book);
    public List<Book> getAllCourses();
}
