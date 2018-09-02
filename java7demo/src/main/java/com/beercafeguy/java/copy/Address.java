package com.beercafeguy.java.copy;


public class Address implements Cloneable{
    private int houseNo;
    private String street;
    private long pinCode;

    public Address(int houseNo, String street, long pinCode) {
        this.houseNo = houseNo;
        this.street = street;
        this.pinCode = pinCode;
    }

    /**
     *  Just for shallow copy as there is no object reference as data member
     *
     * @return Address
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getStreet() {
        return street;
    }

    public long getPinCode() {
        return pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", street='" + street + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
