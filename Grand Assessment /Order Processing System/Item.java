package com.ordersystem;

public class Item {

    private String name;
    private double price;
    private int quantityInHand;
    private int reorderLevel;

    public Item(String name, double price, int quantityInHand, int reorderLevel) {
        this.name = name;
        this.price = price;
        this.quantityInHand = quantityInHand;
        this.reorderLevel = reorderLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInHand() {
        return quantityInHand;
    }

    public void setQuantityInHand(int quantityInHand) {
        this.quantityInHand = quantityInHand;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void display() {
        System.out.println(name + " Price: " + price + " Qty: " + quantityInHand);
    }
}