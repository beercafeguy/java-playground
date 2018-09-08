package com.beercafeguy.java.io;

import java.io.*;

public class FileReadUtils {
    public static void main(String[] args) throws IOException {
        File file1=new File("file1.txt");


        //Read using File Reader
        char[] in=new char[100];
        FileReader fr=new FileReader(file1);
        int size=fr.read(in);
        System.out.println("Number of chars: "+size);
        for(char c:in)
            //System.out.println(c);
        fr.close();

        //Read using buffered Reader
        BufferedReader br=new BufferedReader
                (new FileReader(new File("file2.txt")));
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
        br.close();

    }
}
