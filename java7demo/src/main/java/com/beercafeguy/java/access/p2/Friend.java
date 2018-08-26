package com.beercafeguy.java.access.p2;

public class Friend {
    public static void main(String[] args) {
        Child c=new Child();
        //c.doProtectedTest();
        //above is not allowed as default can pnly be accessed by subclasses using inheritance
        c.doPublicTest();
    }
}
