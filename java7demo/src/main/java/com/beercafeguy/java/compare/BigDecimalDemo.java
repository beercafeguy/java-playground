package com.beercafeguy.java.compare;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double d1=0.9486846;
        double d2=0.94863846;
        BigDecimal bd1=new BigDecimal("0.9486846");
        BigDecimal bd2=new BigDecimal("0.94863846");
        System.out.println(d1-d2);
        System.out.println(bd1.subtract(bd2));
        System.out.println(d1 * d2);
        System.out.println(bd1.multiply(bd2));

        System.out.println("Double Value: "+bd1.doubleValue());
        System.out.println("Double Value: "+bd2.doubleValue());
    }
}
