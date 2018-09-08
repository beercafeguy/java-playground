package com.beercafeguy.java.serialization;

import java.io.*;

public class SerializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e=new Employee(101,"Hem",20895.34);

        System.out.println("Employee Before Serialization: "+e);
        System.out.println("Serialization Started");
        FileOutputStream fileOutputStream=new FileOutputStream("employee.srt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();

        System.out.println("Serialization Completed");

        System.out.println("De Serialization Started");
        FileInputStream fileInputStream=new FileInputStream("employee.srt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Employee e2=(Employee)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("De Serialization Completed");

        System.out.println("Employee After Serialization: "+e2);


    }
}
