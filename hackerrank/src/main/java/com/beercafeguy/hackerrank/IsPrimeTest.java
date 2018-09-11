package com.beercafeguy.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrimeTest {

    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String n=scanner.nextLine();
        BigInteger bi=new BigInteger(n);
        if(bi.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
