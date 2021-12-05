package com.company;

import java.util.ArrayList;

public class Room  {
    private int RoomNumber;
    private int numberOfbeds;
    private boolean internetAccess;
    private double pricePernight;
    private String roomType;

    ArrayList<Room>rooms=new ArrayList<>();

    public Room() {
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    //constructor
    public Room(int roomNumber,int numberOfbeds, boolean internetAccess, double pricePernight, String roomType){
        this.RoomNumber=roomNumber;
        this.numberOfbeds=numberOfbeds;
        this.internetAccess = internetAccess;
        this.pricePernight=pricePernight;
        this.roomType=roomType;
    }
    //set method
    public void setRoomNumber(int newRoomNumber){
        RoomNumber=newRoomNumber;
    }
    public void setNumberOfbeds(int newNumberOfbeds){
        numberOfbeds=newNumberOfbeds;
    }
    public void setPricePernight(double newPricePernight){
        pricePernight=newPricePernight;
    }
    public void setRoomType(String newroomType){roomType=newroomType;}

    //get method
    public int getRoomNumber(){
        return RoomNumber;
    }
    public int getNumberOfbeds(){
        return numberOfbeds;
    }
    public boolean getInternetAccess() {return internetAccess;}
    public double getPricePernight(){
        return pricePernight;
    }
    public String getRoomType(){
        return roomType;}
}


