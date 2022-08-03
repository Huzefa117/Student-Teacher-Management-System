package com.project.management.service.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.management.entity.Student;

import java.io.IOException;

public class StudentServiceImpl implements StudentService {

    @Override
    public Student saveStudent(String StudentJson) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(StudentJson, Student.class);
            return student;
        }catch (Exception e){
            return null;
        }
    }
}
