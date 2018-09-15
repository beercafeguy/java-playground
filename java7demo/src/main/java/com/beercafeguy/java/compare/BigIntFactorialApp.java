package com.beercafeguy.java.compare;

import java.math.BigInteger;

public class BigIntFactorialApp {
    public static void main(String[] args) {
        BigInteger bi=new BigInteger("100");
        System.out.println("Factorial of 100: "+getFact(bi));
    }

    private static BigInteger getFact(BigInteger input){

        BigInteger f=new BigInteger("1");
        for(int i=2;i<=input.intValue();i++){
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
