package com.example.homework3_3_introductiontodatabases.repository;

import com.example.homework3_3_introductiontodatabases.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Collection<Student> findAllByAge(int age);

    Collection<Student>  findAllBy ();
}
