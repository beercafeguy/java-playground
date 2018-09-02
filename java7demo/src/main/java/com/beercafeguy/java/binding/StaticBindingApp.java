package com.beercafeguy.java.binding;

public class StaticBindingApp {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.display();
        Animal dog=new Dog();
        dog.display();
    }
}
