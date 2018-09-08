package com.beercafeguy.java.io;

import java.io.Console;

public class ConsoleJava6App {
    public static void main(String[] args) {
        Console console=System.console();
        System.out.println("Is console Available: "+console);
        if(console!=null){
            System.out.print("Please enter User Name: ");
            String userName=console.readLine();
            System.out.println();
            System.out.println("Please Enter Password: ");
            char pw[] =console.readPassword();
            if(userName.equalsIgnoreCase("beercafeguy") && pw[0]=='1'){
                System.out.println("Welcome To Beercafe");
            }else{
                System.out.println("Invalid Login");
            }
        }
    }
}
