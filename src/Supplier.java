package com.inventory;

public class Supplier {
    private int supplierID;
    private String name, address, phone, email;

    public Supplier(int supplierID, String name, String address, String phone, String email) {
        this.supplierID = supplierID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getSupplierID() { return supplierID; }
    public String getName() { return name; }
}
