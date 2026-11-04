package com.functionalinterface;

@FunctionalInterface
public interface Account {
    void openAccount();

    static void amount(){
        System.out.println("Amount check");
    }

    default void bankName(){
        System.out.println("HDFC");
    }

    private void databaseConnection(){
        System.out.println("Connecting database connection..");
    }
}
