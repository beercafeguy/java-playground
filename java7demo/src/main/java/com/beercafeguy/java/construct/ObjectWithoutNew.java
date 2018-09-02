package com.beercafeguy.java.construct;

public class ObjectWithoutNew {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //way one
        Class cl=Class.forName("com.beercafeguy.java.construct.Teacher");
        Teacher teacher=(Teacher) cl.newInstance();

        //clone
        //Serialization
        //String and Arrays are generally created without new
        
    }
}

class Teacher{

}