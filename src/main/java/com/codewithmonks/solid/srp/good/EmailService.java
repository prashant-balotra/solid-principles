package com.codewithmonks.solid.srp.good;

/*GOOD: Single responsibility - Email operations only*/

public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to: " + user.getEmail());
    }

    public void sendPasswordResetEmail(User user) {
        System.out.println("Sending password reset email to: " + user.getEmail());
    }
}
