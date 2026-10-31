package com.interface2.defaultMethod;

public class Main {
    public static void main(String[] args) {
        Booking booking = new FlightBooking();

        booking.book();
        booking.checkStatus();
    }
}
