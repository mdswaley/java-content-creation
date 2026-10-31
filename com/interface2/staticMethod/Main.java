package com.interface2.staticMethod;

public class Main {
    public static void main(String[] args) {
        DebitCard obj = new DebitCard();
        obj.makePayment(500);
        obj.enterPin();

        Payment.sendMessage("Hello");
    }
}
