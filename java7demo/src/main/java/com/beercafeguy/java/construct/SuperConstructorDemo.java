package com.beercafeguy.java.construct;

public class SuperConstructorDemo {
    public static void main(String[] args) {
        Dog dog=new Dog();
    }
}

class Animal{
    public Animal(){
        System.out.println("Animal Constructor called");
    }
}

class Dog extends Animal{
    public Dog(){
        //super is implicit if we don't add a call to other constructor
        //super();
        this("Landy Kutta");
        System.out.println("Dog Constructor called");
    }

    public Dog(String breed){
        System.out.println("Dog constructor with Breed: "+breed+" called.");
    }
}


