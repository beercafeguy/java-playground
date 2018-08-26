package com.beercafeguy.java.access;

public class Foo {
    private void doFoo(){
        System.out.println("Foooooooooooooo");
    }

    public static void main(String[] args) {
        Foo foo=new Foo();
        foo.doFoo();
    }
}
