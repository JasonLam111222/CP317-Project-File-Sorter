package com.inventory;

public class Product {
    private int productID;
    private String name, description, status;
    private double price;
    private int quantity;
    private Supplier supplier;

    public Product(int productID, String name, String description, double price, int quantity, String status, Supplier supplier) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.supplier = supplier;
    }

    public int getProductID() { return productID; }
    public String getProductName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public String getStatus() { return status; }
    public Supplier getSupplier() { return supplier; }
}
