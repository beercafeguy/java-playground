package com.beercafeguy.java.copy;

public class RefCopyTest {
    public static void main(String[] args) {
        Foo foo=new Foo("qwerty");
        System.out.println(foo.getId());
        Foo newFoo=foo;
        newFoo.setId("hdfc");
        System.out.println(foo.getId());
        System.out.println(newFoo.getId());
    }
}

class Foo{
    private String id;

    public Foo(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
