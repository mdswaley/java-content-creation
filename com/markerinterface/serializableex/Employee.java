package com.markerinterface.serializableex;

import java.io.Serializable;

public class Employee implements Serializable {

    // track the modification
    public static final long serialVersionUID = 2l;

    String empId;
    String name;
    transient String password; // skip while serialization

    Employee(String empId, String name, String password){
        this.empId = empId;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}









// In Java, Serializable is a marker interface that
// tells the JVM that an object of a particular class is
// eligible for serialization.










/*
 *          JAVA SERIALIZATION
 *
 *       Employee Object
 *              |
 *              |
 *              v
 *      Serialization Process
 *              |
 *              |
 *              v
 *       Byte Stream
 *              |
 *              |
 *              v
 *       File / Network

*/
