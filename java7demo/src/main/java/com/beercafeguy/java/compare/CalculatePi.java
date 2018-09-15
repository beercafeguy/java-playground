package com.beercafeguy.java.compare;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatePi {
    public static void main(String[] args) {
        int num=22;
        int denom=7;
        BigDecimal n=BigDecimal.valueOf(num);
        BigDecimal d=BigDecimal.valueOf(denom);
        System.out.println(n);
        System.out.println(d);
        System.out.println(n.divide(d,200,RoundingMode.HALF_UP));
        //BigDecimal pi=BigDecimal.valueOf(num).divide(BigDecimal.valueOf(denom));
        //System.out.println(pi);
    }
}
