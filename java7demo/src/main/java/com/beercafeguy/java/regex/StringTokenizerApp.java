package com.beercafeguy.java.regex;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        StringTokenizer tokenizer=new StringTokenizer("a,b,c,4,e,ff",",");
        System.out.println("Number of tokens:"+tokenizer.countTokens()); // this should be 6
        while(tokenizer.hasMoreTokens()){
            System.out.println("> "+tokenizer.nextToken()+" <");
        }
        System.out.println("Number of tokens:"+tokenizer.countTokens()); // this will come 0
    }
}
