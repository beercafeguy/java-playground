package com.beercafeguy.java.construct;

public class DefaultCons {
    public static void main(String[] args) {

    }
}

class Student{
    public Student(String name){
        System.out.println("Student constructor called and student is "+study());

    }

    static String study(){
        return "Studying...";
    }
}

class SmartStudent extends Student{

    public SmartStudent() {
        super("Default"); //this should be explicitly given here
    }
}
