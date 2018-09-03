package com.beercafeguy.java.assertion;

//java -ea class name to enable
public class AssertDemo {
    public static void main(String[] args) {
        method(10);
        method(-2);
    }

    private static void method(int i){
        assert(i>0):"Passed Value: "+i;
        System.out.println(i);
    }
}
