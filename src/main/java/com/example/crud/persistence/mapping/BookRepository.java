package com.example.crud.persistence.mapping;

import com.example.crud.persistence.enteties.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
