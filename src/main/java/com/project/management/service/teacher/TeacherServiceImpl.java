package com.project.management.service.teacher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.management.entity.Teacher;
import com.project.management.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    public TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher){
        try {
            Teacher teacher1 = teacherRepository.save(teacher);
            return teacher1;
        }catch(Exception e){
            return null;
        }

    }
}
