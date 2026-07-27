package com.alexanderbayer.bestellverwaltung;

public class OrderItem {
    private int orderItemId;
    private int orderId;
    private int productId;
    private int quantity;

    public OrderItem(int orderItemId, int orderId, int productId, int quantity) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{id=" + orderItemId + ", orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity + "}";
    }
}