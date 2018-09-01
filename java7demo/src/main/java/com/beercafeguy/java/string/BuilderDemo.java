package com.beercafeguy.java.string;

public class BuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("abc");
        builder.append("def").reverse().insert(3,"---");
        System.out.println(builder);

        //StringBuilders can be created without initial value where initial capacity is 16
        //and off course we can create with given capacity
        StringBuilder s=new StringBuilder(3);
        s.insert(5,"---"); //this will throw exception as I am starting insert at an index outside builder capacity


    }

    public static String testBuilderCapacity(){
        StringBuilder s=new StringBuilder(10);
        s.insert(12,"------------");
        return s.toString();
    }
}
