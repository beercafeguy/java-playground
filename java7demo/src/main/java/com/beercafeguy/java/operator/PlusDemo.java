package com.beercafeguy.java.operator;

public class PlusDemo {
    public static void main(String[] args) {
        System.out.println("STRING"+2+3); //STRING23
        System.out.println("STRING"+(2+3));//STRING5
        System.out.println(""+2+3);//23
        System.out.println(2+3+"STRING");//5STRING
        System.out.println(4+5+"STRING"+2+3);//9STRING23
    }
}
