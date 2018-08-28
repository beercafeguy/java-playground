package com.beercafeguy.java.overloading;

class Foo {
    public void print(String input){
        System.out.println("String " +input);
    }

    public void print(Integer integer){
        System.out.println("Integer "+integer);
    }

    public void display(String input){
        System.out.println("display String "+input);
    }

    public void display(int integer){
        System.out.println("Display int "+integer);
    }
}


public class FooApp{
    public static void main(String[] args) {
        Foo foo=new Foo();
        //following will throw compile time error
        //foo.print(null);

        //but display will resolved to a non primitive call
        foo.display(null);
    }
}