package com.beercafeguy.java.copy;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
    private int id;
    private String name;
    private Set<String> subjects;

    public Teacher(int id, String name, Set<String> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    public Teacher(Teacher teacher) {

        this.id = teacher.getId();
        this.name = teacher.getName();

        //this is shallow copy
        //this.subjects = teacher.getSubjects()

        // so for deep copy, create a new instance of HashSet
        this.subjects = new HashSet<String>(teacher.getSubjects());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}
