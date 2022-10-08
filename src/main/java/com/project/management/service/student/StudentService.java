package com.project.management.service.student;

import com.project.management.entity.Student;
import org.hibernate.HibernateException;

import java.io.IOException;
import java.util.List;

public interface StudentService {
     Student saveStudent(Student StudentJson) ;
     List<Student> getStudentBySubjectId(String subId);


}
