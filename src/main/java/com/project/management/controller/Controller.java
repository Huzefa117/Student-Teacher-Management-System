package com.project.management.controller;

import com.project.management.entity.Student;
import com.project.management.entity.Teacher;
import com.project.management.service.student.StudentService;
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
    @RequestMapping("/")
    public String reqMethod() {
        return "Hello World";
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) throws Exception {
        //return "Studnt";
        return studentService.saveStudent(student);
    }

    @PostMapping("/createTeacher")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/getStudents/{subjectId}")
    public List<Student> getStudents(@PathVariable String subjectId){
        return studentService.getStudentBySubjectId(subjectId);
    }
}
