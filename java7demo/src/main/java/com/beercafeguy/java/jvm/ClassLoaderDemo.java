package com.beercafeguy.java.jvm;


/***
 *  OP:
 *  null
 *  sun.misc.Launcher$AppClassLoader@18b4aac2
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader()); //returns null because this
        // returns Bootstrap and bootstrap doesn't have a toString method because Bootstrap is not a child class of object
        System.out.println(ClassLoaderDemo.class.getClassLoader());
    }
}
