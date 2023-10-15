package com.example.homework3_3_introductiontodatabases.service;

import com.example.homework3_3_introductiontodatabases.model.Student;
import com.example.homework3_3_introductiontodatabases.repository.FacultyRepository;
import com.example.homework3_3_introductiontodatabases.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student add(Student student) {
        return repository.save(student);
    }

    public Student get(long id) {
        return repository.findById(id).orElse(null);
    }

    public Student remove(long id) {
        var studentTemporary = repository.findById(id).orElse(null);
        if (studentTemporary != null) {
            repository.delete(studentTemporary);
        }
        return studentTemporary;
    }

    public Student update(Student student) {
        var studentTemporary = repository.findById(student.getId()).orElse(null);
        if (studentTemporary != null) {
            repository.save(student);;
        }
        return student;
    }

    public Collection<Student> filterByAge(int age) {
        return  repository.findAllByAge(age);
    }

    public Collection<Student> returnAll() {
        return repository.findAllBy();
    }


}
