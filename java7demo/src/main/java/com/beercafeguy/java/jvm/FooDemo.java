package com.beercafeguy.java.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class loading happens from top in bottom on class and Parent to child in class tree
 *
 * There are 3 class loaders in java
 *  1> Bootstrap - to load native code from bootstrap location (JAVA_HOME/jre/lib)
 *  2> Extension Class Loader - to load classes from extension dir (JAVA_HOME/jre/lib/ext)
 *  3> System/Application class loader - load classes from application classpath
 *
 *  Inheritance hierarchy : Bootstrap(top) -> Extension(child of bootstrap) -> System (last in tree)
 *
 */
public class FooDemo {
    public static void main(String[] args) {
        Foo foo=new Foo();
        Foo foo1=new Foo();
        Class c=foo.getClass();
        Class c1=foo1.getClass();
        System.out.println(c.getName());
        Method methods[]=c.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println("Method:"+method.getName());
        }

        Field fields[]=c.getFields();
        for (Field field:fields) {
            System.out.println("Field:"+field.getName());
        }

        //for both foo objects, class object will be same
        // in other words, both foo objects will point to same Class object
        System.out.println(c==c1);
    }
}
