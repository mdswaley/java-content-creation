package com.interface2.privateMethod;

public interface Account {
    void openAccount();
    void closeAccount();

    private void databaseConnection(){
        System.out.println("Connecting with Database");
    }

    default void bankName(){
        System.out.println("HDFC Bank");
    }
}
