package com.markerinterface.Permission;

public class Main {
    public static void main(String[] args) {
        User user = new User("Raaj", 24);

        Admin admin = new Admin("Ajay",
                "aj234");

        if (user instanceof AdminPermission){
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

    }
}
// instanceof is an operator used to check whether an object
// belongs to a particular class, subclass, or implements a
// particular interface.
//
//It returns a boolean value: true or false.
