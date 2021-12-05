package com.company;

import java.io.FileWriter;
import java.util.ArrayList;

public class Booking {
    private int booking_id;
    private long checkInDate;
    private long checkOutDate;
    private String guest;
    private int numberOfNights;
    private String room;

    public Booking(int booking_id, long checkInDate, long checkOutDate, String room, String guest, int numberOfNights) {
        this.booking_id = booking_id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
        this.guest = guest;
        this.numberOfNights = numberOfNights;


    }
    public int getBooking_id() {
        return booking_id;
    }
    public long getCheckInDate() {
        return checkInDate;
    }
    public long getCheckOutDate() {
        return checkOutDate;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public String getGuest() {
        return guest;
    }
    public  String getRoom(){return room;}

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setCheckInDate(long checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(long checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public void setRoom(String room) {this.room = room;}

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

}


