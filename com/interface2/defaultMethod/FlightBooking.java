package com.interface2.defaultMethod;

public class FlightBooking implements Booking{
    @Override
    public void book() {
        System.out.println("Flight booked");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Flight is canceled");
    }

    @Override
    public void checkStatus() {
        System.out.println("Available");
    }
}
