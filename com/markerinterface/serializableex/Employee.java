package com.markerinterface.serializableex;

import java.io.Serializable;

class Employee implements Serializable {
    String empId;
    String name;

    Employee(String empId, String name){
        this.empId = empId;
        this.name = name;
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
