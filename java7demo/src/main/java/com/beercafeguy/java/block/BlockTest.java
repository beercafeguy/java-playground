package com.beercafeguy.java.block;

public class BlockTest {
    public static void main(String[] args) {

        Dog dog=new Dog();
    }
}

class Pet{
    static{
        System.out.println("Pet static block");
    }
    {
        System.out.println("Pet initialization block");
    }
    public Pet() {
        System.out.println("Pet constructor called.");
    }
}

class Dog extends Pet{
    static{
        System.out.println("Dog static block");
    }
    {
        System.out.println("Dog initialization block");
    }
    public Dog() {
        System.out.println("Dog constructor called.");
    }
}
