package com.beercafeguy.java.composition;

public class MailerBox implements Box{
    @Override
    public void pack() {
        System.out.println("Packing");
    }

    @Override
    public void seal() {

        System.out.println("Sealing");
    }

    public void addPostage(){
        System.out.println("Adding Postage");
    }

    public void ship(){
        System.out.println("Shipping");
    }
}
