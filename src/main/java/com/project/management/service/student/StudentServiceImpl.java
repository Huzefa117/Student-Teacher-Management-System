package com.project.management.service.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.management.entity.Student;
import com.project.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student StudentJson) {
        try {
            Student student = studentRepository.save(StudentJson);
            return student;
        }catch (Exception e){
            return null;
        }
    }
}
