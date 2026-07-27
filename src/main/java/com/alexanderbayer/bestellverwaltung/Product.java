package com.alexanderbayer.bestellverwaltung;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setter für stock: wir brauchen die Möglichkeit, den Lagerbestand später zu ändern
    // (z.B. wenn eine Bestellung aufgegeben wird)
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{id=" + productId + ", name='" + name + "', price=" + price + ", stock=" + stock + "}";
    }
}