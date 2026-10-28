package com.abstraction;

class FoodDelivery {
    private int amount;

    public void deliveryOrder(int amount){
        connectWithDatabase();
        confirmOrder();
        assignDeliveryPartner();
        trackLocation();
    }

    private void connectWithDatabase(){
        System.out.println("Connection with db...");
    }

    private boolean confirmOrder(){
        System.out.println("Order is confirm");
        return true;
    }

    private String assignDeliveryPartner(){
        System.out.println("Assigning Delivery partner");
        return "Raaj";
    }

    private void trackLocation(){
        System.out.println("Tracking location");
    }
}