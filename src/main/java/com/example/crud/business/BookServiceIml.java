package com.example.crud.business;

import com.example.crud.persistence.enteties.Book;
import com.example.crud.persistence.mapping.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceIml implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book saveCourse(Book book) {
        return bookRepository.save(book) ;
    }

    @Override
    public List<Book> getAllCourses() {
        return bookRepository.findAll() ;
    }
}
