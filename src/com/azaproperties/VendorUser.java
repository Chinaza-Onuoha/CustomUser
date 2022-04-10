package com.azaproperties;

public class VendorUser {
    private String ID;
    private String branchID;
    private String adminName;
    private String numberOfStaff;
    private String numberOfBranch;

    public VendorUser(String  ID,String branchID, String adminName,String numberOfStaff,String numberOfBranch) {
        this.ID = ID;
        this.branchID = branchID;
        this.adminName = adminName;
        this.numberOfStaff = numberOfStaff;
        this.numberOfBranch = numberOfBranch;
    }
}
