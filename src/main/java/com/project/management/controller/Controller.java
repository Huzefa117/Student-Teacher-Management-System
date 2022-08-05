package com.project.management.controller;

import com.project.management.entity.Student;
import com.project.management.entity.Subject;
import com.project.management.entity.Teacher;
import com.project.management.service.student.StudentService;
import com.project.management.service.subject.SubjectService;
import com.project.management.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("/")
    public String reqMethod() {
        return "Hello World";
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {
        //return "Studnt";
        return studentService.saveStudent(student);
    }
    @PostMapping("/createStudentWithSubject")
    public Student createStudentWithSubject(@RequestBody Student student) {
        //return "Studnt";
        return studentService.saveStudentWithSubjects(student);
    }

    @PostMapping("/createTeacher")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @PostMapping("/createSubject")
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.saveSubject(subject);
    }

//    @GetMapping("/getStudentsBasedOnSubject/{subject}/{studentId}")
//    public List<Student> getStudents(@PathVariable String subject, @PathVariable Long studentId){
//        //return subjectService.fetchStudents()
//    }
}
