package com.beercafeguy.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// \d+ d12c3m will return 1 4
//Source: abc 0XDC8
//Pattern: 0[xX][0-9a-fA-F]
 // 4 0XD
public class PatternMatchingApp {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(args[0]);
        Matcher matcher= pattern.matcher(args[1]);

        System.out.println("Source: "+args[1]);
        System.out.println("Pattern: "+matcher.pattern());
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
