package com.interface2.staticMethod;

public class UPIPayment implements Payment{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment using UPI");
    }

    public void scanQRCode() {
        System.out.println("Scanning UPI QR Code");
    }
}
