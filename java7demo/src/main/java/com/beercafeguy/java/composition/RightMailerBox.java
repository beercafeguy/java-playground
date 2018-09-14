package com.beercafeguy.java.composition;

public class RightMailerBox implements Mailer,Box{
    private Box box;
    public RightMailerBox(Box box) {
        this.box=box;
    }

    @Override
    public void pack() {
        box.pack();
    }

    @Override
    public void seal() {
        box.seal();
    }

    @Override
    public void addPostage() {
        System.out.println("Adding Postage");
    }

    @Override
    public void ship() {
        System.out.println("Adding shipping");
    }
    
}
