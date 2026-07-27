package com.alexanderbayer.bestellverwaltung;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private static final String URL = "jdbc:sqlite:bestellverwaltung.db";

    // Neuen Kunden in die Datenbank einfügen
    public void save (String name, String email){
        String sql = "INSERT INTO customer (name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
        PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();

            System.out.println("Kunde gespeichert: " + name);

        } catch (SQLException e){
            System.out.println("Fehler beim Speichern: " + e.getMessage());
        }
    }

    // Alle Kunden aus der Datenbank lesen
    public List<Customer> findAll(){
    List<Customer> customers = new ArrayList<>();
    String sql = "SELECT * FROM customer";

    try (Connection conn = DriverManager.getConnection(URL);
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            int id = rs.getInt("customer_id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            customers.add(new Customer(id, name, email));
        }
    } catch (SQLException e) {
        System.out.println("Fehler beim Lesen: " + e.getMessage());
    }

        return customers;
    }
}
