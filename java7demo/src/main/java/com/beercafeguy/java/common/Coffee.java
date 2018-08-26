package com.beercafeguy.java.common;

public class Coffee {

    enum Outlet{CCD,BARISTA,NESCAFE,STARBUCKS,COSTA_COFFEE}

    private CoffeeSize coffeeSize;
    private Outlet outlet;

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(final CoffeeSize coffeeSize){
        this.coffeeSize=coffeeSize;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }
}
