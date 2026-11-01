package com.output.basedquestion;

public class Main {
    public static void main(String[] args) {
        Employee employee = null;
        employee.showDetails();
//        if we don't make static it will throw NullPointerException
    }
}

/**
 * output would print showDetails() why
 * bcz static method is belongs to class not object
 * so even you assign null in object reference
 * compiler convert employee.showDetails(); to Employee.showDetails();
 * at compilation time.
 * */

class Employee{
    static void showDetails(){
        System.out.println("Employee Details...");
    }
}
