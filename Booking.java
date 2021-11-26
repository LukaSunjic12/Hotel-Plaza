package com.company;

import java.util.ArrayList;

public class Booking {
    private int booking_id;
    private long checkInDate;
    private long checkOutDate;
    private Guest guest;
    private int numberOfNights;

    public Booking() {
        ArrayList<Room>rooms=new ArrayList<>();
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
    public Guest getGuest() {
        return guest;
    }
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setCheckInDate(long checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(long checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

}
