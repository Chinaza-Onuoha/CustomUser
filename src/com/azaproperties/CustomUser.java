package com.azaproperties;

public class CustomUser {
    private String ID;
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private String logo;
    private String address;
    private String ipAddress;

    public CustomUser(String ID, String name, String password,String email, String phoneNumber, String dateOfBirth,String logo,String address,String ipAddress) {
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.logo = logo;
        this.address = address;
        this.ipAddress = ipAddress;

    }
}
