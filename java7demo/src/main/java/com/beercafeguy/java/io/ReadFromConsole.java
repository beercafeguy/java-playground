package com.beercafeguy.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name=console.readLine();
        System.out.println("Enter your Age: ");
        int age=Integer.parseInt(console.readLine());

        System.out.println("Name and Age: "+name+" | "+age);

    }
}
