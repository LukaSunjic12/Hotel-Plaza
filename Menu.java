package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private Object Class;
    private boolean exit;
    private Object numberOfNights;
    private Object price;

    public long nextLong() {
        return nextLong();
    }

    private static final long serialVersionUID = 8811230760997066428L;
    //Array list creation for classes
    ArrayList<Room> rooms = new ArrayList<Room>();
    ArrayList<Booking> bookings = new ArrayList<Booking>();
    ArrayList<Staff> staffs = new ArrayList<Staff>();
    ArrayList<Guest> guests = new ArrayList<Guest>();



    public void chooseMenu() {


        Scanner scanner1 = new Scanner(System.in);

        while (1 == 1) {
            boolean exit = false;
            System.out.println("Press 1 for staff menu");
            System.out.println("Press 2 for customer menu");
            System.out.println("Press 3 for exit");
            int options1 = scanner1.nextInt();
            switch (options1) {
                case 1:
                    staffMenu();
                    break;
                case 2:
                    customerMenu();
                    break;
                case 3:
                    exit = true;
                    break;

            }
            if (exit) {
                System.out.println("Goodbye");
                break;

            }
        }


    }


    //to load rooms file
    public void loadRooms() {
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

    public void saveRooms() {
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
                String checkInDate = scanner.next();
                String checkOutDate = scanner.next();
                String guest = scanner.next();
                int numberOfNights = scanner.nextInt();
                String room = scanner.next();
                Booking newBooking = new Booking(booking_id, checkInDate, checkOutDate, room, guest, numberOfNights);
                System.out.println(booking_id + " " + checkInDate + " " + checkOutDate + " " + room + " " + guest + " " + numberOfNights);
                bookings.add(newBooking);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveBooking() {
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
        try {
            File file2 = new File("staffs.txt");
            Scanner scanner = new Scanner(file2);
            int number_of_rows = scanner.nextInt();
            for (int i = 0; i < number_of_rows; ++i) {
                String title = scanner.next();
                String name = scanner.next();
                String lastname = scanner.next();
                int telephoneNumber = scanner.nextInt();
                double salary = scanner.nextDouble();
                Staff newStaff = new Staff(title, name, lastname, telephoneNumber, salary);
                System.out.println(title + " " + name + " " + lastname + " " + telephoneNumber + " " + salary);
                staffs.add(newStaff);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveStaff() {
        try {
            FileWriter writer = new FileWriter("staffs.txt");
            int len = staffs.size();
            System.out.println(len);
            writer.write(len + "\n");
            for (Staff staff : staffs) {
                writer.write(staff.getTitle() + " " + staff.getName() + " " + staff.getLastName() + " " + staff.getTelephoneNumber() + " " + staff.getSalary() + "\n");
            }
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadGuest() {
        try {
            File file3 = new File("guests.txt");
            Scanner scanner = new Scanner(file3);
            int number_of_rows = scanner.nextInt();
            for (int i = 0; i < number_of_rows; i++) {
                String name = scanner.next();
                System.out.println(name + name.length());
                String address = scanner.next();
                int telephonenumber1 = scanner.nextInt();
                Guest newGuest = new Guest(name, address, telephonenumber1);
                System.out.println(name + " " + address + " " + telephonenumber1 + " " + newGuest.getName().length());
                guests.add(newGuest);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveGuest() {
        try {
            FileWriter writer = new FileWriter("guests.txt");
            int len = guests.size();
            System.out.println(len);
            writer.write(len + "\n");
            for (Guest guest : guests) {
                writer.write(guest.getName() + " " + guest.getAddress() + " " + guest.getTelephoneNumber() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void staffMenu() {
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
            System.out.println("Press 7 for staff change");
            System.out.println("Press 8 for booking date change");
            System.out.println("Press 9 to exit");

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
                    System.out.println("Enter check in date dd-mm-yyyy");
                    String checkInDate = scanner.next();
                    System.out.println("Enter check out date dd-mm-yyyy");
                    String checkOutDate = scanner.next();
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
                    System.out.println("Enter last name");
                    String lastname = scanner.next();
                    System.out.println("Enter telephone number");
                    int telephoneNumber = scanner.nextInt();
                    System.out.println("Enter salary");
                    double salary = scanner.nextDouble();
                    Staff newStaff = new Staff(title, name, lastname, telephoneNumber, salary);
                    staffs.add(newStaff);
                    break;
                case 4: //create Guest
                    System.out.println("Enter name");
                    String name1 = scanner.next();
                    System.out.println("Enter address");
                    String address = scanner.next();
                    System.out.println("Enter telephone number");
                    long telephonenumber = scanner.nextLong();
                    Guest newGuest = new Guest(name1, address, telephonenumber);
                    guests.add(newGuest);
                    break;
                case 5:
                    System.out.println("Enter room number:");
                    roomNum = scanner.nextInt();
                    System.out.println("Enter new room price:");
                    price = scanner.nextDouble();
                    for (int i = 0; i < rooms.size(); ++i) {
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
                    System.out.println("Enter new name");
                    String name2 = scanner.next();
                    System.out.println("Enter new address");
                    address = scanner.next();
                    System.out.println("Enter new telephone number");
                    telephonenumber = scanner.nextInt();
                    for (int i = 0; i < guests.size(); ++i) {
                        if (Objects.equals(guests.get(i).getName(), name1)) {
                            Guest guestChange = guests.get(i);
                            guestChange.setName(name1);
                            guestChange.setAddress(address);
                            guestChange.setTelephoneNumber(telephonenumber);
                            //guestChange.setName(name1);
                            // guestChange.setAddress(address);
                            //guestChange.setTelephoneNumber(telephonenumber);
                            guests.get(i).setName(name2);
                            guests.get(i).setAddress(address);
                            guests.get(i).setTelephoneNumber(telephonenumber);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter title");
                    title = scanner.next();
                    System.out.println("Enter new title");
                    String title1 = scanner.next();
                    System.out.println("Enter new last name");
                    lastname = scanner.next();
                    System.out.println("Enter new phone number");
                    telephoneNumber = scanner.nextInt();
                    System.out.println("Enter new salary");
                    salary = scanner.nextInt();
                    for (int i = 0; i < staffs.size(); ++i) {
                        if (staffs.get(i).getTitle().equals(title)) {
                            Staff staffChange = staffs.get(i);
                            staffChange.setTitle(title1);
                            staffChange.setLastName(lastname);
                            staffChange.setTelephoneNumber(telephoneNumber);
                            staffChange.setSalary(salary);

                            staffs.get(i).setTitle(title1);
                            staffs.get(i).setLastName(lastname);
                            staffs.get(i).setTelephoneNumber(telephoneNumber);
                            staffs.get(i).setSalary(salary);
                        }
                    }
                    break;

                case 8:
                    System.out.println("Enter booking_id");
                    booking_id = scanner.nextInt();
                    System.out.println("Enter new check in date dd-mm-yyyy");
                    checkInDate = scanner.next();
                    System.out.println("Enter new check out date dd-mm-yyyy");
                    checkOutDate = scanner.next();
                    System.out.println("Enter new number of nights");
                    numberOfNights = scanner.nextInt();
                    for (int i = 0; i < bookings.size(); ++i) {
                        if (bookings.get(i).getBooking_id() == booking_id) ;
                        {
                            bookings.get(i).setCheckInDate(checkInDate);
                            bookings.get(i).setCheckOutDate(checkOutDate);
                            bookings.get(i).setNumberOfNights(numberOfNights);

                        }
                    }
                    break;

                case 9:
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
        loadRooms();
        loadBooking();
        loadStaff();
        loadGuest();
        Scanner scanner3 = new Scanner(System.in);

        while (1 == 1) {
            System.out.println("Press 1 for booking");
            System.out.println("Press 2 for room availability");
            System.out.println("Press 3 for bill");
            System.out.println("Press 4 to exit");

            int options2 = scanner3.nextInt();
            switch (options2) {
                case 1:
                    System.out.println("Enter check in date dd-mm-yyyy");
                    String checkInDate = scanner3.next();
                    System.out.println("Enter check out date dd-mm-yyyy");
                    String checkOutDate = scanner3.next();
                    System.out.println("Enter Guest details");
                    System.out.println("Enter  name");
                    String name = scanner3.next();
                    System.out.println("Enter address");
                    String address = scanner3.next();
                    System.out.println("Enter telephone number");
                    long telephoneNumber = scanner3.nextLong();
                    for (Guest guest : guests) {
                        if (Objects.equals(name, guest.getName())) {
                            address = guest.getAddress();
                            telephoneNumber = guest.getTelephoneNumber();
                        }
                    }
                    break;
                case 2:

                    System.out.println("Enter room type");
                    String roomType = scanner3.next();
                    for (Room room : rooms) {
                        if (Objects.equals(room.getRoomType(), roomType)) {
                            System.out.println("Room number: " + room.getRoomNumber() + " " + "Number of beds" + " " + room.getNumberOfbeds() + " " + " Internet access" + " " + room.getInternetAccess() + " " + "Price per night" + " " + room.getPricePernight());
                        }
                    }

                    break;
                case 3:
                    for (Room room : rooms) {
                        for (Booking booking : bookings) {
                            if (Objects.equals(booking.getNumberOfNights(), numberOfNights)) {
                                System.out.println("number of nights");
                                if (Objects.equals(room.getPricePernight(), price)) {
                                    System.out.println("Price" + " " + room.getPricePernight());
                                    int x = booking.getNumberOfNights();
                                    double y = room.getPricePernight();
                                    double z = x * y;
                                    System.out.println("Receipt " + z);
                                }
                                if (Objects.equals(room.getPricePernight(), price)) {
                                    System.out.println("Price" + " " + room.getPricePernight());
                                    int x = booking.getNumberOfNights();
                                    double y = room.getPricePernight();
                                    double z = x * y;
                                    System.out.println("Receipt " + z);
                                }


                            }
                        }
                    }
                    break;

                case 4:
                    exit = true;
                    break;
            }

                if (exit) {
                    System.out.println("Goodbye");
                    break;
                }

            }



            }

        }








