package com.beercafeguy.java.copy;

import java.util.Arrays;
import java.util.HashSet;

public class CopyFactoryApp {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher(101,
                "Aman Singh",
                new HashSet<String>(Arrays.asList("English","Maths")));
        Teacher teacher2=Teacher.newInstance(teacher1); //calling factory

        System.out.println("Teacher 1 subjects : "+ teacher1.getSubjects());
        teacher2.getSubjects().add("Biology");

        System.out.println("Teacher 1 subjects : "+ teacher1.getSubjects());
        System.out.println("Teacher 2 subjects : "+ teacher2.getSubjects());
    }
}
