package com.codewithmonks.solid.srp.good;

/**
 * GOOD: Single responsibility - User business logic coordination
 */
public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void registerUser(String email, String name) {
        if (isValidEmail(email)) {
            User user = new User(email, name);
            userRepository.save(user);
            emailService.sendWelcomeEmail(user);
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
