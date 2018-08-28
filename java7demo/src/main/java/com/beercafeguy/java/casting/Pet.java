package com.beercafeguy.java.casting;

public interface Pet {
    public void beFriendly();
}

class Cat implements Pet{

    @Override
    public void beFriendly() {
        System.out.println("Hay how Are you . I am catty");
    }
}

class MonaCat extends Cat implements Pet{
    //here I don't have any obligation of implementing beFriendly
}
