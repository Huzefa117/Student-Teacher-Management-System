package com.project.management.service.teacher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.management.entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Override
    public Teacher saveTeacher(String TeacherJson){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Teacher teacher = objectMapper.readValue(TeacherJson, Teacher.class);
            return teacher;
        }catch(Exception e){
            return null;
        }

    }
}
