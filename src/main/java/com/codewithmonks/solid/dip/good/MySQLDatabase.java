package com.codewithmonks.solid.dip.good;

/**
 * GOOD: Low-level module implements abstraction
 */
public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }

    @Override
    public String retrieve(String id) {
        return "Data from MySQL for ID: " + id;
    }
}
