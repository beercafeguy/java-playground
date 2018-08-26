package com.beercafeguy.java.arr;

public class ArrayIni {
    public static void main(String[] args) {
        int i[]=new int[10];
        for(int count=0;count<10;count++){
            i[count]=count*count;
        }

        for (int x:
             i) {
            System.out.println(x);
        }
    }
}
