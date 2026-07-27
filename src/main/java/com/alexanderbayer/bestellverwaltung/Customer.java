package com.alexanderbayer.bestellverwaltung;

public class Customer {
    private int customerId;
    private String name;
    private String email;

    // Konstruktor: wird aufgerufen, wenn man ein neues Customer-Objekt erstellt
    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // Getter: Methoden, um an die Werte heranzukommen
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // toString: legt fest, wie ein Customer als Text angezeigt wird (praktisch zum Debuggen)
    @Override
    public String toString() {
        return "Customer{id=" + customerId + ", name='" + name + "', email='" + email + "'}";
    }
}