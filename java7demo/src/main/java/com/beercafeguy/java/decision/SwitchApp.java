package com.beercafeguy.java.decision;

/**
 *  default block is not mandatory
 *  java switch falls through if there is no break statement
 */
public class SwitchApp {
    public static void main(String[] args) {
        int a=10;
        switch(a){
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("This is Two");
        }
    }
}
