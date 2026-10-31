package com.interface2.staticMethod;

public class CreditCard implements Payment{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment using Credit Card");
    }

    public void swipeCard() {
        System.out.println("Credit Card Swiped");
    }
}
