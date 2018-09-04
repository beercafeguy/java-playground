package com.beercafeguy.java.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatApp {
    public static void main(String[] args) {
        float f1=201.35f;
        Locale localeIN=new Locale("hi","IN");
        NumberFormat[] formats=new NumberFormat[4];
        formats[0]=NumberFormat.getInstance();
        formats[1]=NumberFormat.getInstance(localeIN);
        formats[2]=NumberFormat.getCurrencyInstance();
        formats[3]=NumberFormat.getCurrencyInstance(localeIN);
        for (NumberFormat format: formats
             ) {
            System.out.println(format.format(f1));
        }
    }
}
