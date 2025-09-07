package com.codewithmonks.solid.dip.good;

/**
 * GOOD: Another implementation of the abstraction
 */
public class PostgreSQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to PostgreSQL: " + data);
    }

    @Override
    public String retrieve(String id) {
        return "Data from PostgreSQL for ID: " + id;
    }
}
