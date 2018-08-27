package com.beercafeguy.java.overriding;

import java.io.IOException;

class Foo {
    public void read() throws IOException{
        System.out.println("Reading Foo");
    }
}

class Hoo extends Foo{
    //following not allowed because of different return type
    //public String read() throws IOException{return null;}

    //following not allowed because throwing a broader exception
    //public void read() throws Exception{return null;}

    public void read(){
        System.out.println("Reading Hoo with no exceptions");
    }
}

class Zoo extends Foo{
    //following not allowed as we can not have more restrictive access level
    //void read(){
    //    System.out.println("Reading Hoo with no exceptions");
    //}
}


