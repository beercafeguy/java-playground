package com.beercafeguy.java.block;

public class Foo {

    {
        System.out.println("Ini block 1");
    }
    {
        System.out.println("Ini block 0");
    }



    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 0");
    }



    public Foo(){
        System.out.println("This is foo");
    }

    public static void main(String[] args) {
        Foo foo1=new Foo();
        Foo foo2=new Foo();
    }
}
