package com.beercafeguy.java.operator;

public class PrepostFix {
    public static void main(String[] args) {
        int numOfOnlinePlayers=0;
        System.out.println(numOfOnlinePlayers++);//0
        System.out.println(numOfOnlinePlayers);//1
        System.out.println(++numOfOnlinePlayers);//2
        System.out.println(numOfOnlinePlayers);//2
    }
}
