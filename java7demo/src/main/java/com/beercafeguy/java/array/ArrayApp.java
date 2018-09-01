package com.beercafeguy.java.array;

public class ArrayApp {
    public static void main(String[] args) {
        int testScores[];
        testScores=new int[10];
        for(int testScore: testScores)
            System.out.println(testScore); //array does not have a default value but array of primitives
        //primitives will get default value

        //following is not allowed
        //long l[]=new int[10];
        long l[]=new long[10];
        l[0]=new Integer(2); // this is allowed

        Animal[] animals=new Dog[10];//for objects, this is allowed but not primitives

    }

    public static void printNrgativeIndex(int arr[]){
        //runtime exception
        System.out.println(arr[-2]);
    }
}
