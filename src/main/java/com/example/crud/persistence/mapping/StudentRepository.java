package com.example.crud.persistence.mapping;

import com.example.crud.persistence.enteties.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
