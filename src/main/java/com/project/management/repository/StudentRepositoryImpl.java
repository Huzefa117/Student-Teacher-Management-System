package com.project.management.repository;

import com.project.management.entity.Student;

import java.util.List;

public abstract class StudentRepositoryImpl implements StudentRepository {
    @Override
    public Student findByStudent(String Name) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}
