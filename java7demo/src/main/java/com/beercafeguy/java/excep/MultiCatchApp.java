package com.beercafeguy.java.excep;

import java.io.IOException;

public class MultiCatchApp {
    public static void main(String[] args) {
        try{
            System.out.println("Test Area");
            if(true){
                throw new IOException("I don't know what happened.");
            }
        }catch(IOException|NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
