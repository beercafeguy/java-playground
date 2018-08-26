package com.beercafeguy.java.access.p1;

public class Child extends Parent{
    void askParentForDefaultTest(){
        doDefaultTest();
        //above is allowed as we can access default data members within package
    }

    void askParentForProtectedTest(){
        doProtectedTest();
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.askParentForDefaultTest();
        c.askParentForProtectedTest();
    }
}
