package com.codewithmonks.solid.dip.bad;

/**
 * Low-level module
 */
public class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }

    public String retrieve(String id) {
        return "Data from MySQL for ID: " + id;
    }
}
