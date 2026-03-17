package com.ordersystem;

public class Main {

    public static void main(String[] args) {

        OrderSystem system = new OrderSystem();

        Item i1 = new Item("Laptop", 50000, 20, 5);
        Item i2 = new Item("Mouse", 500, 100, 10);

        system.addItem(i1);
        system.addItem(i2);

        Customer c1 = new Customer("John", "NY", "123456789", "john@email.com");
        system.addCustomer(c1);

        Order order = new Order(1, c1);

        order.addItem(i1, 1);
        order.addItem(i2, 2);

        system.placeOrder(order);

        system.findItemByName("Laptop").display();

        system.ordersByCustomer("John");

        system.highestOrder();
    }
}