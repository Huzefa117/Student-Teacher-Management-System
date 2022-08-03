package com.project.management.service.student;

import com.project.management.entity.Student;
import com.project.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        try {
            return studentRepository.save(student);
        }catch (Exception e){
            return null;
        }
    }
}
