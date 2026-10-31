package com.interface2.staticMethod;

public class DebitCard implements Payment{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment using Debit Card");
    }

    public void enterPin() {
        System.out.println("Debit Card PIN Verified");
    }
}
