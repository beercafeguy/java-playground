package com.beercafeguy.java.composition;

public class GiftBox implements Box{
    @Override
    public void pack() {
        System.out.println("Packing");
    }

    @Override
    public void seal() {
        System.out.println("Sealing");
    }
}
