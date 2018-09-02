package com.beercafeguy.java.overriding;

public class Region {
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}
