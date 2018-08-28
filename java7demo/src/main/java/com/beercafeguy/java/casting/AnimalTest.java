package com.beercafeguy.java.casting;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a[]={new Animal(),new Dog(),new Animal()};
        for(Animal animal:a){
            animal.makeNoise();
            if(animal instanceof Dog){
                ((Dog) animal).playDead(); //here is casting
            }
        }
    }
}

class Animal {
    public void makeNoise(){
        System.out.println("Generic noise");
    }
}

class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Barking....");
    }

    public void playDead(){
        System.out.println("Dog playing dead");
    }
}
