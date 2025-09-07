package com.codewithmonks.solid.srp.good;

import java.util.ArrayList;
import java.util.List;

/**
 * GOOD: Single responsibility - Data persistence only
 */
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
        System.out.println("User saved to database: " + user);
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}
