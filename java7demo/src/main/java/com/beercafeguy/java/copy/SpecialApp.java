package com.beercafeguy.java.copy;

public class SpecialApp {
    public static void main(String[] args) {
        Special special=new Special();
        StringBuffer buffer=special.getBuffer();
        buffer.append("Chandra");
        special.printBuffer();
    }
}
