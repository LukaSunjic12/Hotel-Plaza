package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public long nextLong(){
        return nextLong();
    }
    private static final long serialVersionUID = 8811230760997066428L;
    //Array list creation for classes
    ArrayList<Room> rooms = new ArrayList<Room>();
    ArrayList<Booking> bookings = new ArrayList<Booking>();
    ArrayList<Staff>staffs=new ArrayList<Staff>();
    ArrayList<Guest> guests=new ArrayList<Guest>();


    //to load rooms file
    public void loadRooms () {
        try {
            File file = new File("rooms.txt");
            Scanner scanner = new Scanner(file);
            int number_of_rows = scanner.nextInt();
            for (int i = 0; i < number_of_rows; ++i) {
                int roomNum = scanner.nextInt();
                int bedsNum = scanner.nextInt();
                boolean internet = scanner.nextBoolean();
                double price = scanner.nextDouble();
                String roomType = scanner.next();
                Room newRoom = new Room(roomNum, bedsNum, internet, price, roomType);
                System.out.println(roomNum + " " + bedsNum + " " + internet + " " + price + " " + roomType);
                rooms.add(newRoom);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //to save rooms in a file and write to the file

    public void saveRooms () {
        try {
            FileWriter writer = new FileWriter("rooms.txt");
            int len = rooms.size();
            System.out.println(len);
            writer.write(len + "\n");
            for (Room room : rooms) {
                writer.write(room.getRoomNumber() + " " + room.getNumberOfbeds() + " " + room.getInternetAccess() + " " + room.getPricePernight() + " " + room.getRoomType() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //for booking
    public void loadBooking() {
        try {
            File file1 = new File("bookings.txt");
            Scanner scanner = new Scanner(file1);
            int number_of_rows = scanner.nextInt();
            for (int i = 0; i < number_of_rows; ++i) {
                int booking_id = scanner.nextInt();
                long checkInDate = scanner.nextLong();
                long checkOutDate = scanner.nextLong();
                String guest = scanner.next();
                int numberOfNights = scanner.nextInt();
                String room=scanner.next();
                Booking newBooking = new Booking(booking_id, checkInDate, checkOutDate, room,guest,numberOfNights);
                System.out.println(booking_id + " " + checkInDate+ " " + checkOutDate + " " + room + " " + guest + " " + numberOfNights);
                bookings.add(newBooking);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveBooking () {
        try {
            FileWriter writer = new FileWriter("bookings.txt");
            int len = bookings.size();
            System.out.println(len);
            writer.write(len + "\n");
            for (Booking booking : bookings) {
                writer.write(booking.getBooking_id() + " " + booking.getCheckInDate() + " " + booking.getCheckOutDate() + " " + booking.getRoom() + " " + booking.getGuest() + " " + booking.getNumberOfNights() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadStaff() {
        try{
            File file2=new File("staffs.txt");
            Scanner scanner=new Scanner(file2);
            int number_of_rows = scanner.nextInt();
            for (int i = 0; i < number_of_rows; ++i){
                String title = scanner.next();
                String name = scanner.next();
                int telephoneNumber = scanner.nextInt();
                Staff newStaff=new Staff(title,name,telephoneNumber);
                System.out.println(title + " " + name + " " + telephoneNumber);
                staffs.add(newStaff);
            }
            scanner.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void saveStaff(){
        try {
            FileWriter writer = new FileWriter("staffs.txt");
            int len = staffs.size();
            System.out.println(len);
            writer.write(len + "\n");
            for (Staff staff : staffs) {
                writer.write(staff.getTitle() + " " + staff.getName() + " " + staff.getTelephoneNumber() + "\n");}
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadGuest(){
        try{
            File file3=new File("guests.txt");
            Scanner scanner=new Scanner(file3);
            int number_of_rows=scanner.nextInt();
            for(int i = 0; i < number_of_rows; i++){
                String name = scanner.next();
                String address = scanner.next();
                int telephonenumber1 = scanner.nextInt();
                Guest newGuest=new Guest(name,address,telephonenumber1);
                System.out.println(name + " " + address + " " + telephonenumber1);
                guests.add(newGuest);
            }
            scanner.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void saveGuest() {
        try {
            FileWriter writer = new FileWriter("guests.txt");
            int len = guests.size();
            System.out.println(len);
            writer.write(len + "\n");
            for (Guest guest :guests) {
                writer.write(guest.getName() + " " + guest.getAddress() + " " + guest.getTelephoneNumber() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void staffMenu () {
        Scanner scanner = new Scanner(System.in);
        while (1 == 1) {
            rooms.clear();
            guests.clear();
            staffs.clear();
            bookings.clear();

            loadRooms();
            loadBooking();
            loadStaff();
            loadGuest();

            System.out.println("Press 1 to create a room");
            System.out.println("Press 2 for booking");
            System.out.println("Press 3 for staff selection");
            System.out.println("Press 4 for guests");
            System.out.println("Press 5 for room price change");
            System.out.println("Press 6 for guest change");
            System.out.println("Press 7 to exit");

            int options = scanner.nextInt();
            boolean exit = false;
            switch (options) {
                case 1: //create a room
                    System.out.println("Enter room number:");
                    int roomNum = scanner.nextInt();
                    System.out.println("Enter number of beds:");
                    int bedsNum = scanner.nextInt();
                    System.out.println("Does the room have internet access [true/false]:");
                    boolean internet = scanner.nextBoolean();
                    System.out.println("Enter room price:");
                    double price = scanner.nextDouble();
                    System.out.println("Enter room type:");
                    String roomType = scanner.next();
                    Room newRoom = new Room(roomNum, bedsNum, internet, price, roomType);
                    rooms.add(newRoom);
                    break;
                case 2://create booking
                    System.out.println("Enter booking_id");
                    int booking_id = scanner.nextInt();
                    System.out.println("Enter check in date");
                    long checkInDate = scanner.nextLong();
                    System.out.println("Enter check out date");
                    long checkOutDate = scanner.nextLong();
                    System.out.println("Guest that is booking");
                    String guest = scanner.next();
                    System.out.println("Enter number of nights");
                    int numberOfNights = scanner.nextInt();
                    System.out.println("Enter room");
                    String room = scanner.next();
                    Booking newBooking = new Booking(booking_id, checkInDate, checkOutDate, guest, room, numberOfNights);
                    bookings.add(newBooking);
                    break;
                case 3: //create staff
                    System.out.println("Enter title");
                    String title = scanner.next();
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter telephone number");
                    int telephoneNumber = scanner.nextInt();
                    Staff newStaff = new Staff(title, name, telephoneNumber);
                    staffs.add(newStaff);
                    break;
                case 4: //create Guest
                    System.out.println("Enter name");
                    String name1 = scanner.next();
                    System.out.println("Enter address");
                    String address = scanner.next();
                    System.out.println("Enter telephone number");
                    int telephonenumber = scanner.nextInt();
                    Guest newGuest = new Guest(name1, address, telephonenumber);
                    guests.add(newGuest);
                    break;
                case 5:
                    System.out.println("Enter room number:");
                    roomNum = scanner.nextInt();
                    System.out.println("Enter new room price:");
                    price = scanner.nextDouble();
                    for (int i = 0; i < rooms.size(); ++i){
                        if (rooms.get(i).getRoomNumber() == roomNum) {
                            /*Room roomChange = rooms.get(i);
                            roomChange.setPricePernight(price);
                            rooms.set(i, roomChange);
                            */
                            rooms.get(i).setPricePernight(price);
                        }
                    }
                    break;
                    case 6:
                        System.out.println("Enter name");
                         name1 = scanner.next();
                        System.out.println("Enter address");
                         address = scanner.next();
                        System.out.println("Enter telephone number");
                         telephonenumber = scanner.nextInt();
                         for (int i = 0; i < guests.size(); ++i){
                             if (guests.get(i).getName()==name1){
                                 Guest guestChange=guests.get(i);
                                 guestChange.setName(name1);
                                 guestChange.setAddress(address);
                                 guestChange.setTelephoneNumber(telephonenumber);
                                 guests.set(i,guestChange);
                             }
                         }
                         break;

                    case 7:
                     exit = true;
                    break;
            }

            saveRooms();
            saveBooking();
            saveStaff();
            saveGuest();

            if (exit) {
                System.out.println("Goodbye!");
                break;
            }
        }

    }

    public void customerMenu() {

    }
}
