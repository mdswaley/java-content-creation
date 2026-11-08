package com.markerinterface.Permission;

public class Admin implements AdminPermission{
    String adminName;
    String password;

    public Admin(String adminName, String password){
        this.adminName = adminName;
        this.password = password;
    }
}
