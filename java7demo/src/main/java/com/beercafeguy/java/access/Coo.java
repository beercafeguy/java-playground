package com.beercafeguy.java.access;

public class Coo extends Foo{
    public void accessDoFoo(){
        //doFoo()
        //we can't inherit a private method anywhere
    }

    public void doCoo(){
        System.out.println("Cooooo");
    }
    public static void main(String[] args) {
        Foo foo=new Coo();
        //foo.doCoo(); not allowed
        Coo coo=new Coo();
        coo.doCoo(); //ALLOwed

    }
}
