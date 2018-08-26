package com.beercafeguy.java.access.p2;

import com.beercafeguy.java.access.p1.Parent;

public class Child extends Parent{
    void askParentForDefaultTest(){
        //doDefaultTest();
        //above is not allowed as we can't access default data members outside package
    }

    void askParentForProtectedTest(){
        doProtectedTest();
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.askParentForProtectedTest();
    }
}
