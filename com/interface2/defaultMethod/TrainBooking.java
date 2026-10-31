package com.interface2.defaultMethod;

public class TrainBooking implements Booking{
    @Override
    public void book() {
        System.out.println("Train booked");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Train is canceled");
    }

    @Override
    public void checkStatus() {
        System.out.println("Available");
    }
}
