package com.project.management.entity;

import java.util.List;
import java.util.UUID;

public class Student {
    private String Id;
    private String Name;
    private boolean ArtificialIntelligence;
    private boolean DataStructures;
    private boolean Algorithms;

    public Student(String Name){
        this.Id = UUID.randomUUID().toString();
        this.Name = Name;
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

    public boolean isArtificialIntelligence() {
        return ArtificialIntelligence;
    }

    public void setArtificialIntelligence(boolean artificialIntelligence) {
        ArtificialIntelligence = artificialIntelligence;
    }

    public boolean isDataStructures() {
        return DataStructures;
    }

    public void setDataStructures(boolean dataStructures) {
        DataStructures = dataStructures;
    }

    public boolean isAlgorithms() {
        return Algorithms;
    }

    public void setAlgorithms(boolean algorithms) {
        Algorithms = algorithms;
    }


}
