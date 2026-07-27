package com.alexanderbayer.bestellverwaltung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();

        // Einen neuen Kunden speichern
        customerRepository.save("Anna Schmidt", "anna.schmidt@mail.de");
        customerRepository.save("Max Müller", "max.mueller@mail.de");

        // Alle Kunden ausgeben
        System.out.println("\nAlle Kunden in der Datenbank:");
        for (Customer c : customerRepository.findAll()) {
            System.out.println(c);
        }
    }
}