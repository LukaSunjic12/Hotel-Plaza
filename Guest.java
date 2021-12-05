package com.company;

import java.util.ArrayList;

public class Guest {
    private String name;
    private String address;
    private int telephoneNumber;
    private ArrayList<Guest>guests=new ArrayList<>();

    public Guest(){

    }

    public Guest(String name, String address, int telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public String toString(){
        return "Name:" + name + ",address:"+address;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
}



