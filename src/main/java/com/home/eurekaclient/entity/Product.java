package com.home.eurekaclient.entity;

public class Product {
    private long id;
    private String name;
    private double basePrice;
    private int quantity;
    private double totlalPrice;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                ", quantity=" + quantity +
                ", totlalPrice=" + totlalPrice +
                '}';
    }

    public Product(long id, String name, double basePrice, int quantity) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotlalPrice() {
        return totlalPrice;
    }

    public void setTotlalPrice(double totlalPrice) {
        this.totlalPrice = totlalPrice;
    }
}
