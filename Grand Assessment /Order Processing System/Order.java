package com.ordersystem;

import java.util.*;

public class Order {

    private int orderId;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();
    private Date date;
    private double totalAmount;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.date = new Date();
        this.totalAmount = 0;
    }

    public void addItem(Item item, int quantity) {

        if(item.getQuantityInHand() >= quantity) {

            OrderItem orderItem = new OrderItem(item, quantity);
            items.add(orderItem);

            totalAmount += item.getPrice() * quantity;

            item.setQuantityInHand(item.getQuantityInHand() - quantity);

        } else {
            System.out.println("Not enough stock for " + item.getName());
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Date getDate() {
        return date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}