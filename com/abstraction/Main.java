package com.abstraction;

// Abstraction means hiding Core implementation details and exposing
// only the essential functionality.

//  We can achieve abstraction proper encapsulation.
public class Main {
    public static void main(String[] args) {
        FoodDelivery obj = new FoodDelivery();

        obj.deliveryOrder(4000);
    }
}

