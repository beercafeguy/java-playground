package com.beercafeguy.java.copy;

import java.util.Arrays;
import java.util.HashSet;

/***
 *  Used for copying object with the mix of shallow and deep copy
 *
 */
public class CopyConstructorApp {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher(101,
                "Aman Singh",
                new HashSet<String>(Arrays.asList("English","Maths")));
        Teacher teacher2=new Teacher(teacher1);

        System.out.println("Teacher 1 subjects : "+ teacher1.getSubjects());
        teacher2.getSubjects().add("Biology");

        System.out.println("Teacher 1 subjects : "+ teacher1.getSubjects());
        System.out.println("Teacher 2 subjects : "+ teacher2.getSubjects());

    }
}
