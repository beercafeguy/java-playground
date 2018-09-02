package com.beercafeguy.lombok;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello LomBok!");
        Person p1=new Person("Hem","Chandra", LocalDate.now());
        System.out.println(p1.getCurrentTime());
        System.out.println(p1);
    }
}
