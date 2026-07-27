package com.alexanderbayer.bestellverwaltung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:bestellverwaltung.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Verbindung zur Datenbank erfolgreich!");
            }
        } catch (SQLException e) {
            System.out.println("Fehler bei der Verbindung: " + e.getMessage());
        }
    }
}