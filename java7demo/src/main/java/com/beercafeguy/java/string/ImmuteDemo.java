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


        String s4=new String("ABCD");
        String s5="ABCD";
        System.out.println("HashCode for ["+s4+"] is "+s1.hashCode());
        System.out.println("HashCode for ["+s5+"] is "+s4.hashCode());
        System.out.println("Both of the above won't be same in hashCode because s4 is created in non pool area.");
        System.out.println("I mean whenever we create String using new, we actually create two objects");
        System.out.println("One in non pool heap and one in pool area");

        System.out.println(s4.length()); //length is a method unlike Array where length is a data member
    }
}
