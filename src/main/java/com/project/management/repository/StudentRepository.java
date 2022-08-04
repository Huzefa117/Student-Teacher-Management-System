package com.project.management.repository;


import com.project.management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
   // Student saveStudent(Student student);

    //public Student findByStudent(String Name);
}
