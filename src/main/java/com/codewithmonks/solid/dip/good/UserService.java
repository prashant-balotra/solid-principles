package com.codewithmonks.solid.dip.good;

/**
 * GOOD: High-level module depends on abstraction
 */
public class UserService {
    private final Database database; // Depends on abstraction

    public UserService(Database database) { // Dependency injection
        this.database = database;
    }

    public void saveUser(String userData) {
        database.save(userData);
    }

    public String getUser(String userId) {
        return database.retrieve(userId);
    }
}
