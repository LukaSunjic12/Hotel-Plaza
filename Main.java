package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Rooms
        //single rooms
        Room room1 = new Room(1, 1, 1200, "single");
        Room room2 = new Room(2, 1, 1400, "single");
        //double rooms
        Room room11 = new Room(11, 2, 2300, "double");
        Room room12 = new Room(12, 2, 2700, "double");
        //ensuite rooms
        Room room21 = new Room(21, 2, 3800, "ensuite");
        Room room22 = new Room(22, 1, 3450, "ensuite");
        System.out.println("Room 1 specifications:" + "Room number:" + room1.getRoomNumber() + "Number of beds:" + room1.getNumberOfbeds() + "Price per night: " + room1.getPricePernight() + "Room type:" + room1.getRoomType());
        System.out.println("Room 2 specifications:" + "Room number:" + room2.getRoomNumber() + "Number of beds:" + room2.getNumberOfbeds() + "Price per night: " + room2.getPricePernight() + "Room type:" + room2.getRoomType());

        System.out.println("Room 11 specifications:" + "Room number:" + room11.getRoomNumber() + "Number of beds:" + room11.getNumberOfbeds() + "Price per night:" + room11.getPricePernight() + "Room type:" + room11.getRoomType());
        System.out.println("Room 12 specifications:" + "Room number:" + room12.getRoomNumber() + "Number of beds:" + room12.getNumberOfbeds() + "Price per night:" + room12.getPricePernight() + "Room type:" + room12.getRoomType());

        System.out.println("Room 21 specifications:" + "Room number:" + room21.getRoomNumber() + "Number of beds:" + room21.getNumberOfbeds() + "Price per night:" + room21.getPricePernight() + "Room type:" + room21.getRoomType());
        System.out.println("Room 22 specifications:" + "Room number:" + room22.getRoomNumber() + "Number of beds:" + room22.getNumberOfbeds() + "Price per night:" + room22.getPricePernight() + "Room type:" + room22.getRoomType());

        //Arrray list for rooms
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room11);
        rooms.add(room12);
        rooms.add(room21);
        rooms.add(room22);

        //Guests
        Guest guest1 = new Guest("Jack Tilbus", "London st.3", 98745601);
        Guest guest2 = new Guest("Jonas Guildberg", "Liberation alley 45", 2874902);
        Guest guest3 = new Guest("Anne Christensen", "H.C.Andersens Boulevard 254", 45621897);
        Guest guest4 = new Guest("Ivan Horvat", "St.Nicholas 67", 37854521);
        Guest guest5 = new Guest("Adam McJack", "Dublin road 421", 56890123);
        Guest guest6 = new Guest("Jan Gotze", "Airort way 32", 74821349);
        Guest guest7 = new Guest("Juan Santos", "Barca street 89", 48976328);
        Guest guest8 = new Guest("Maria Delgrado", "Via Italia 59", 67849075);

        System.out.println("Name:" + guest1.getName() + " ,Address:" + guest1.getAddress() + " ,telephone number" + guest1.getTelephoneNumber());
        System.out.println("Name:" + guest2.getName() + " ,Address:" + guest2.getAddress() + " ,telephone number" + guest2.getTelephoneNumber());
        System.out.println("Name:" + guest3.getName() + " ,Address:" + guest3.getAddress() + " ,telephone number" + guest3.getTelephoneNumber());
        System.out.println("Name:" + guest4.getName() + " ,Address:" + guest4.getAddress() + " ,telephone number" + guest4.getTelephoneNumber());
        System.out.println("Name:" + guest5.getName() + " ,Address:" + guest5.getAddress() + ", telephone number" + guest5.getTelephoneNumber());
        System.out.println("Name:" + guest6.getName() + " ,Address: " + guest6.getAddress() + " ,telephone number" + guest6.getTelephoneNumber());
        System.out.println("Name:" + guest7.getName() + " ,Address:" + guest7.getAddress() + " ,telephone number" + guest7.getTelephoneNumber());
        System.out.println("Name:" + guest8.getName() + " ,Address:" + guest8.getAddress() + " ,telephone number" + guest8.getTelephoneNumber());


        ArrayList<Guest>guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        guests.add(guest4);
        guests.add(guest5);
        guests.add(guest6);
        guests.add(guest7);
        guests.add(guest8);


        //Staff
        Staff staff1 = new Staff("Director", "Antonio Busquests", 32456789);
        Staff staff2 = new Staff("Accountant", "Carl Hansen", 95643212);
        Staff staff3 = new Staff("Receptionist", "Joel DeValera", 57418090);
        Staff staff4 = new Staff("Cleaner", "Cecilie Jorgensen", 84567321);

        System.out.println("title: " + staff1.getTitle() + " name: " + staff1.getName() + " telephone number: " + staff1.getTelephoneNumber());
        System.out.println("title: " + staff2.getTitle() + " name: " + staff2.getName() + " telephone number: " + staff2.getTelephoneNumber());
        System.out.println("title: " + staff3.getTitle() + " name: " + staff3.getName() + " telephone number: " + staff3.getTelephoneNumber());
        System.out.println("title: " + staff4.getTitle() + " name: " + staff4.getName() + " telephone number: " + staff4.getTelephoneNumber());

        ArrayList<Staff>staffs=new ArrayList<Staff>();
        staffs.add(staff1);
        staffs.add(staff2);
        staffs.add(staff3);
        staffs.add(staff4);


    }
}

