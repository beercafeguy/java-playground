package com.beercafeguy.java;

import com.beercafeguy.java.array.ArrayApp;
import org.junit.Test;

public class AppArrayTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNegativeIndex(){
        int[] intArray={1,2,3,4,5};
        //ArrayApp.printNrgativeIndex(intArray);
        ArrayApp.printNrgativeIndex(new int[]{1,2,3,4,5});//anonymous array creation
    }
}
