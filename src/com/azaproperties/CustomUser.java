package com.azaproperties;

public class CustomUser {
    private String ID;
    private String name;
    private String location;
    private String zipCode;
    private String ipAddress;
    private String password;
    private String email;
    private String phoneNumber;

    public CustomUser(String ID, String name, String location, String zipCode, String ipAddress, String password,String email, String phoneNumber) {
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.zipCode = zipCode;
        this.ipAddress = ipAddress;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
}
