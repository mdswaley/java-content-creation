package com.interface2.privateMethod;

public class User implements Account{
    @Override
    public void openAccount() {
        System.out.println("Opening account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing account");
    }
}
