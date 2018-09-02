package com.beercafeguy.java.overriding;

public class Flower {

    String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatsYourName() {
        return "Lily";
    }
}