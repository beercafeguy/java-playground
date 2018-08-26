package com.beercafeguy.java.common;

public class CoffeeTest1 {
    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        coffee.setCoffeeSize(CoffeeSize.BIG);
        coffee.setOutlet(Coffee.Outlet.COSTA_COFFEE); //accessed like a static member of Coffee class
        System.out.println(coffee.getCoffeeSize().getOunce()+" ounce coffee from "+coffee.getOutlet());

        for(CoffeeSize coffeeSize:CoffeeSize.values())
            System.out.println(coffeeSize+"|"+coffeeSize.getOunce());
    }
}
