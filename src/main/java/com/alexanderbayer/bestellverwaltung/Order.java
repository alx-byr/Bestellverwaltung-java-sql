package com.alexanderbayer.bestellverwaltung;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private int customerId;
    private LocalDate orderDate;

    public Order(int orderId, int customerId, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customerId=" + customerId + ", date=" + orderDate + "}";
    }
}