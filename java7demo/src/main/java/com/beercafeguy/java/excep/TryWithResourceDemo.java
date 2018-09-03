package com.beercafeguy.java.excep;

public class TryWithResourceDemo {
    public static void main(String[] args) {
        try(One one=new One();Two two=new Two()){
            System.out.println("Try");
            throw new RuntimeException();
        }catch(Exception ex){
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }
    }
}

class One implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing One");
    }
}

class Two implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing Two");
    }
}
