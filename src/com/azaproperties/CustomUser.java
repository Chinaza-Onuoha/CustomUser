package com.azaproperties;

public class CustomUser {
    private String ID;
    private String name;
    private String location;
    private String zipCode;
    private String ipAddress;
    private String password;

    public CustomUser(String ID, String name, String location, String zipCode, String ipAddress, String password) {
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.zipCode = zipCode;
        this.ipAddress = ipAddress;
        this.password = password;
    }
}
