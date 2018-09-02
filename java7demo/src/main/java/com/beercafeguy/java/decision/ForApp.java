package com.beercafeguy.java.decision;

public class ForApp {
    public static void main(String[] args) {
        for(
            /* initialization block*/ int i=0,j=10;
            /* check (op should be boolean)*/ (i<10 && j>0);
            /* increment of the variables*/i++,j--
            ){

            System.out.println("I: "+i+" | J: "+j);
        }

        for(int i=0;i<1;i++){
            System.out.println(i); //only runs once and prints 0
            //loop run
            // initialization -> test -> run -> increment -> test -> run -> increment -> test -> run .....
        }

        for (;;)
            System.out.println("Infinite for Loop");
    }
}
