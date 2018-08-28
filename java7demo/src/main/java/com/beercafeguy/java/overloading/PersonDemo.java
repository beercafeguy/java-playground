package com.beercafeguy.java.overloading;

public class PersonDemo {
    public static void main(String[] args) {

        Painter2 p=new Person();
        p.paint();
    }
}

class Person implements Painter1,Painter2{

    @Override
    public void paint() {
        //need to implement only once
        System.out.println("Painting");
    }
}





interface Painter1{
    void paint();
}

interface Painter2{
    void paint();
}

