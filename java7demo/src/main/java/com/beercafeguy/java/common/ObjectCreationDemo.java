package com.beercafeguy.java.common;

//https://www.geeksforgeeks.org/gfact-52-java-object-creation-of-inherited-classes/

public class ObjectCreationDemo {
    public static void main(String[] args) {
        Cow cow=new Cow();
    }
}

class Pet{
    public Pet() {
        System.out.println("Parent constructor called");
        System.out.println("Hash code: "+this.hashCode()+"| Class Name: "+this.getClass());
    }
}

class Cow extends Pet{
    public Cow() {
        System.out.println("Child constructor called");
        System.out.println("Hash code: "+this.hashCode()+"| Class Name: "+this.getClass());
    }
}
