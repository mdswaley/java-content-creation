package com.functionalinterface;

public class Main {
    public static void main(String[] args) {
//        lambda expressions
        Account account = () ->
                System.out.println("opening account..");

        account.openAccount();
    }
}
