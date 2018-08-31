package com.beercafeguy.java.operator;

public class EnumEquals {
    enum Color{RED,BLUE}
    public static void main(String[] args) {
        Color c1=Color.RED;
        Color c2=Color.RED;
        System.out.println("=="+(c1==c2));
        System.out.println("equals"+(c1.equals(c2)));
    }
}
