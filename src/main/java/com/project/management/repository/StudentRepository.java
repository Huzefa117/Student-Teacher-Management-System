package com.project.management.repository;


import com.project.management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //Student saveStudent(Student student);
//WHERE u.status = ?1
    @Query(value =  "SELECT * FROM Student s WHERE s.subject_id = ?1",
            nativeQuery = true)
    List<Student> getStudentBySubjectId(@Param("subjectId") String subjectId);

}
