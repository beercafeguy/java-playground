package com.beercafeguy.java.copy;

public class DeepCopyApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address=new Address(12,"Horamavu Agra Main Road",550043);
        User user1=new User(101,"Hem",address);
        User user2=(User) user1.clone();

        System.out.println(user1.getAddress().getPinCode());
        user2.getAddress().setPinCode(560103);
        System.out.println(user1.getAddress().getPinCode());
        System.out.println(user2.getAddress().getPinCode());

        //only in new object address will be changed
    }
}
