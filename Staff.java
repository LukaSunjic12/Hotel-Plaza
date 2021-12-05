package com.company;

import java.util.ArrayList;

public class Staff {
    private String title;
    private String name;
    private int telephoneNumber;
    private ArrayList<Staff> staffs=new ArrayList<>();


    public Staff(String title,String name,int telephoneNumber){
        this.title=title;
        this.name=name;
        this.telephoneNumber=telephoneNumber;
    }
    public String getTitle(){
        return title;
    }
    public String getName(){
        return name;
    }
    public int getTelephoneNumber(){
        return telephoneNumber;
    }

    public void setTitle(String title) {
        this.title = title;}

    public void setName(String name) {
        this.name = name;}

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String toString(){
        return "Title:"+ title + ", name:"+name;
    }

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }
}
