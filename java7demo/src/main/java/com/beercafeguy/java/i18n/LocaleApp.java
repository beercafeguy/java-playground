package com.beercafeguy.java.i18n;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleApp {
    public static void main(String[] args) {
        Locale localeIt=new Locale("it"); //italian
        Locale localeITCh=new Locale("it","CH");//Switzerland
        Calendar cal=Calendar.getInstance();
        cal.set(2018,01,02);
        Date d1=cal.getTime();

        Locale localeIN=new Locale("hi","IN"); //hindi in india
        DateFormat formatIN=DateFormat.getDateInstance(DateFormat.FULL,localeIN);
        System.out.println(formatIN.format(d1));
    }
}
