package com.codewithmonks.solid.srp.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * BAD: This class has multiple responsibilities:
 * 1. User data management
 * 2. Email sending
 * 3. Data persistence
 * 4. Validation
 */
public class UserManagerBad {
    private List<String> users = new ArrayList<>();

    // Responsibility 1: User management
    public void addUser(String user) {
        if (validateUser(user)) {
            users.add(user);
            saveToDatabase(user);
            sendWelcomeEmail(user);
        }
    }

    // Responsibility 2: Validation
    private boolean validateUser(String user) {
        return user != null && user.contains("@");
    }

    // Responsibility 3: Database operations
    private void saveToDatabase(String user) {
        System.out.println("Saving user to database: " + user);
    }

    // Responsibility 4: Email operations
    private void sendWelcomeEmail(String user) {
        System.out.println("Sending welcome email to: " + user);
    }
}
