package com.beercafeguy.java.shadow;

public class BarApp {
    static Bar bar=new Bar();
    public static void main(String[] args) {
        Bar bar=new Bar();
        System.out.println(bar.x);
        modify(bar);
        System.out.println(bar.x);
    }

    static void modify(Bar bar){
        bar.x=20;
    }
}


class Bar{
    int x=10;
}
