package com.codewithmonks.solid.dip.bad;

/**
 * BAD: High-level module depends directly on low-level module
 */
public class UserServiceBad {
    private MySQLDatabase database; // Direct dependency on concrete class

    public UserServiceBad() {
        this.database = new MySQLDatabase(); // Tight coupling
    }

    public void saveUser(String userData) {
        database.save(userData);
    }

    public String getUser(String userId) {
        return database.retrieve(userId);
    }
}
