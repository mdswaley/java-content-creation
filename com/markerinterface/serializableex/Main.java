package com.markerinterface.serializableex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =
                new FileOutputStream("Emp.ser");

        ObjectOutputStream oos = new
                ObjectOutputStream(fos);

        Employee employee = new
                Employee("EMP123",
                "Raaj");

        oos.writeObject(employee);
    }
}
