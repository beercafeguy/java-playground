package com.beercafeguy.java;

import com.beercafeguy.java.string.BuilderDemo;
import org.junit.Test;

public class AppStringTest {

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void builderCapacityTest(){
        BuilderDemo.testBuilderCapacity();
    }
}
