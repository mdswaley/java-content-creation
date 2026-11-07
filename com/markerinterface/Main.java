package com.markerinterface;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee("EMP123", "Raaj");

        Employee copyEmp = (Employee) employee.clone();

        System.out.println("Original Emp: "+employee.name);
        System.out.println("Copy Emp: "+copyEmp.name);
    }
}
