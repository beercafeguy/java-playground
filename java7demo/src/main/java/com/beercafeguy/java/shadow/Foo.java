package com.beercafeguy.java.shadow;

public class Foo {
    private int count=20;

    void printCount(){
        int count=10; //shadowing instance variable count
        System.out.println("Local count"+count);
        System.out.println("Object count:"+this.count);
    }

    public static void main(String[] args) {
        Foo foo=new Foo();
        foo.printCount();
    }
}
