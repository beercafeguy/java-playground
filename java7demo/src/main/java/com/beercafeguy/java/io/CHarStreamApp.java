package com.beercafeguy.java.io;

import java.io.*;

public class CHarStreamApp {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("../.gitignore")));
        String str;
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }


        System.out.println("Now byte stream reader");
        BufferedReader bufferedReaderStream=new BufferedReader(new InputStreamReader(new FileInputStream("../.gitignore")));

        String str1;
        while((str1=bufferedReaderStream.readLine())!=null){
            System.out.println(str1);
        }
    }
}
