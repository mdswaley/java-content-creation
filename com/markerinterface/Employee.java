package com.markerinterface;

public class Employee implements Cloneable{
    String empID;
    String name;

    public Employee(String empID, String name){
        this.empID = empID;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
