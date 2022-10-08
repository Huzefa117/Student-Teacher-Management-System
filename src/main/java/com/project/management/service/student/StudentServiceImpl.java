package com.project.management.service.student;

import com.project.management.entity.Student;
import com.project.management.repository.StudentRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);
    }


    @Override
    public List<Student> getStudentBySubjectId(String subId) {
        return studentRepository.getStudentBySubjectId(subId);
    }
}
