package com.project.management.service.subject;

import com.project.management.entity.Subject;
import com.project.management.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Subject saveSubject(Subject subject) {
        try{
            Subject subject1 = subjectRepository.save(subject);
            return subject1;
        }catch (Exception e){
            return null;
        }
    }
}
