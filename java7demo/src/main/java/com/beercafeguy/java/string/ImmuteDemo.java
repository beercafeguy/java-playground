package com.beercafeguy.java.string;

public class ImmuteDemo {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String(" World!");
        System.out.println("HashCode for ["+s1+"] is "+s1.hashCode());
        System.out.println("HashCode for ["+s2+"] is "+s2.hashCode());

        String s3="Hello";
        System.out.println("HashCode for ["+s3+"] is "+s3.hashCode());
        //if you see the result then you can see that s1 and s3 are referring the same object
        s3=s3.concat(s2).concat("How Are you ?");
        System.out.println("HashCode for ["+s3+"] is "+s3.hashCode());
    }
}
