package com.beercafeguy.java.io;

import java.io.*;

public class FileWriteUtils {
    public static void main(String[] args) throws IOException {
        File file=new File("file1.txt");

        //Using low level file writers
        System.out.println("File write using file Writer started.");
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("This is a basic java writer \n which writes line by line");
        fileWriter.append("\n");
        fileWriter.append("We should avoid this kind of writer as we have better tools.");
        fileWriter.flush();
        fileWriter.close();
        System.out.println("File write using file Writer Completed.");

        //Using Buffered Writer
        System.out.println("File write using BufferedWriter started.");
        File file2=new File("file2.txt");
        //below filewriter is used in append mode
        BufferedWriter bw=new BufferedWriter(new FileWriter(file2,true));
        bw.write("This is line one");
        bw.newLine();
        bw.write("This is line 2");
        bw.newLine();
        bw.append("This is line 3");
        bw.close();
        System.out.println("File write using BufferedWriter Completed.");

        //Using PrintWriters
        System.out.println("File write using PrintWriter started.");
        PrintWriter pw=new PrintWriter(new File("file3.txt"));
        pw.write("This is line 1");
        pw.println();
        pw.write("This is line 2");
        pw.close();
        System.out.println("File write using PrintWriter Completed.");
    }
}
