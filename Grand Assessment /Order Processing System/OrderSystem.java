package com.ordersystem;

import java.util.*;

public class OrderSystem {

    private List<Item> items = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void placeOrder(Order order) {

        for(OrderItem oi : order.getItems()) {

            Item item = oi.getItem();

            if(item.getQuantityInHand() <= item.getReorderLevel()) {
                System.out.println("Cannot place order. Stock low for " + item.getName());
                return;
            }
        }

        orders.add(order);
        System.out.println("Order placed successfully. Total = " + order.getTotalAmount());
    }

    public Item findItemByName(String name) {

        for(Item i : items) {

            if(i.getName().equalsIgnoreCase(name)) {
                return i;
            }
        }

        return null;
    }

    public void ordersByCustomer(String name) {

        for(Order o : orders) {

            if(o.getCustomer().getName().equalsIgnoreCase(name)) {

                System.out.println("Order ID: " + o.getOrderId()
                        + " Amount: " + o.getTotalAmount());
            }
        }
    }

    public void highestOrder() {

        Order max = null;

        for(Order o : orders) {

            if(max == null || o.getTotalAmount() > max.getTotalAmount()) {
                max = o;
            }
        }

        if(max != null) {

            System.out.println("Highest Order ID: "
                    + max.getOrderId()
                    + " Amount: "
                    + max.getTotalAmount());
        }
    }
}