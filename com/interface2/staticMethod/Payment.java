package com.interface2.staticMethod;

//Java 8 interfaces provide utility functionality
//directly inside interfaces using static method.

// without forcing implementing classes
// to provide implementations.
public interface Payment {
    void makePayment(double amount);

    static void sendMessage(String msg){
        System.out.println("Send Message : "+msg);
    }
}
