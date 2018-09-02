package com.beercafeguy.java.copy;

/***
 *  Default version of clone creates a shallow copy of object
 *  If you have a reference to any other object in your class,
 *  only reference will be copied, not a object itself
 *  so shallow copy is not 100% independent of original object
 *
 */
public class ShallowCopyApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course science = new Course("Physics", "Chemistry", "Biology");
        Student student1 = new Student(111, "Hem", science);
        Student student2=(Student) student1.clone();

        System.out.println(student1.getCourse().getSubject3()); //Biology
        student2.getCourse().setSubject3("Maths");
        System.out.println(student1.getCourse().getSubject3()); //Maths
    }
}

