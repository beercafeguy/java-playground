package com.beercafeguy.java.collection;

import java.util.ArrayList;
import java.util.List;

/***
 *  Maintains insertion order even after added in between
 *
 */
public class ArrayListApp {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Srinagar");
        cities.add("Delhi");
        cities.add("Bangalore");
        System.out.println(cities);
        int index=cities.indexOf("Bangalore");
        cities.add(index,"Bhopal");
        System.out.println(cities);

        //System.out.println(cities.get(5)); //this will throw IndexOutOfBoundsException
        cities.add("Chennai");
        System.out.println(cities);
        cities.remove("Chennai");
        System.out.println(cities);
        cities.clear();
        System.out.println(cities);
    }
}
