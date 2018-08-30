package com.beercafeguy.java.str;

import java.util.Objects;

public class ValueOfVsObjects {
    public static void main(String[] args) {
        Foo foo=new Foo();
        String fooStr=String.valueOf(foo);
        System.out.println(fooStr);

        Foo noFoo=null;
        String noFooStr=String.valueOf(noFoo);
        System.out.println(noFooStr);

        //we have a similar method Objects.toString(Object)
        String fooObjStr= Objects.toString(foo);
        System.out.println(fooObjStr);
        //The only advantage of above mentioned new method is below.
        String noFooObjStr=Objects.toString(noFoo,"No foo is there");
        System.out.println(noFooObjStr);
    }
}

class Foo{
    int i=20;

    @Override
    public String toString() {
        return "Foo{" +
                "i=" + i +
                '}';
    }
}
