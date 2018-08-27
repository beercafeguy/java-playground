package com.beercafeguy.java.overriding;

public class PetsApp {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Animal dAnimal=new Dog();

        animal.print();
        dog.print();
        dAnimal.print();

        dog.bark();
        //here is what one can't do
        //animal.bark();
    }
}
