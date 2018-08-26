package com.beercafeguy.java.common;

/***
 *  Enums can not be declared within a method
 */
public enum CoffeeSize {

    BIG(8),HUGE(12),OVERWHELMING(20);
    private int ounce;

    CoffeeSize(int ounce){
        this.ounce=ounce;
    }

    public int getOunce() {
        return ounce;
    }
}
