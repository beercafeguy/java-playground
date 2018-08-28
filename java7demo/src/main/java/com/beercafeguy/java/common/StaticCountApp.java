package com.beercafeguy.java.common;

public class StaticCountApp {
    public static void main(String[] args) {
        Dog d1=new Dog();
        Dog d2=new Dog();
        Dog d3=new Dog();
        System.out.println("Number of dogs: "+Dog.dogCount);
    }
}

class Dog{
    static int dogCount;

    public Dog() {
        dogCount+=1;
    }
}
