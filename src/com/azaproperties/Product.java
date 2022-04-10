package com.azaproperties;

public class Product {
    private String ID;
    private String name;
    private String size;
    private String  weight;
    private String brand;
    private String description;
    private String productionDate;
    private String expiringDate;
    private double price;


    public Product(String ID, String name, String size, String weight, String brand,String description, String productionDate, String expiringDate, double price) {
        this.ID = ID;
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.brand = brand;
        this.description = description;
        this.productionDate = productionDate;
        this.expiringDate = expiringDate;
        this.price = price;
    }
}
