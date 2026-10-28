package com.abstract1;

abstract class ATM {
    ATM(){

    }

    abstract void withdraw();

    void checkBalance(){
        System.out.println("Checking balance");
    }
}
