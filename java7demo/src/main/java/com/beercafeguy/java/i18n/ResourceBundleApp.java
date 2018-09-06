package com.beercafeguy.java.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleApp {
    public static void main(String[] args) {
        String localeChars="en";
        Locale locale=new Locale(localeChars);
        ResourceBundle bundle=ResourceBundle.getBundle("Labels",locale);
        System.out.println(bundle.getString("hello"));


        Locale localeFr=Locale.CHINA;
        ResourceBundle bundleFr=ResourceBundle.getBundle("Labels",localeFr);
        System.out.println(bundle.getString("hello"));
    }
}
