package com.example.homework3_3_introductiontodatabases.repository;

import com.example.homework3_3_introductiontodatabases.model.Faculty;
import com.example.homework3_3_introductiontodatabases.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findFacultiesByColor (String color);

    Collection<Faculty>  findAllBy ();
}
