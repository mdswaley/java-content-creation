package com.service;

// java 17 introduce sealed and permit keyword
sealed class Payment permits Card, UPI {
    Payment(){
        System.out.println("Payment class called.");
    }
}
