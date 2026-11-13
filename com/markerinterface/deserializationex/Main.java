package com.markerinterface.deserializationex;

import com.markerinterface.serializableex.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("Employee.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee employee = (Employee) ois.readObject();

        System.out.println(employee);

        fis.close();
        ois.close();
    }
}
// Remember

// Serialization --> File/Object output Stream --> write the data in to the file
// De-serialization --> File/Object input Stream --> read the data from the file
