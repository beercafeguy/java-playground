package com.beercafeguy.java.copy;

class Student implements Cloneable{
    private int id;
    private String name;
    private Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    /***
     * Default version of clone() method. It creates shallow copy of an object
     * @return Object of the same class with shallow copy
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
