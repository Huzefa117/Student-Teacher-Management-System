package com.project.management.controller;

import com.project.management.entity.Student;
import com.project.management.entity.Teacher;
import com.project.management.service.student.StudentService;
import com.project.management.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private StudentService studentService;
    private TeacherService teacherService;
    @RequestMapping("/")
    public String reqMethod() {
        return "Hello World";
    }

    @RequestMapping(value = "/createStudent", method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student) {
        //return "Studnt";
        return studentService.saveStudent(student);
    }

    @RequestMapping(value = "/createTeacher", method = RequestMethod.POST)
    public Teacher createTeacher(@RequestBody String jsonObject) {
        return teacherService.saveTeacher(jsonObject);
    }
}
