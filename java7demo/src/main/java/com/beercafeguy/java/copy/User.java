package com.beercafeguy.java.copy;

public class User implements Cloneable{
    private int id;
    private String name;
    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user=(User) super.clone();
        user.setAddress((Address) address.clone());
        return user;
    }

    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
