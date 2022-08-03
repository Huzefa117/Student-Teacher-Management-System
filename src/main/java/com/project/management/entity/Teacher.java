package com.project.management.entity;

import java.util.UUID;

public class Teacher {
    private String Id;
    private String Name;
    private String Subject;

    public Teacher(String Name, String Subject){
        this.Id = UUID.randomUUID().toString();
        this.Name = Name;
        this.Subject = Subject;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
