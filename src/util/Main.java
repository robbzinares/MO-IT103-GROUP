package util;

import auth.AuthenticationManager;
import user.UserManager;

public class Main {
    public static void main(String[] args) {
        // Create objects and demonstrate functionality here

        // Example:
        UserManager userManager = new UserManager();
        userManager.registerUser("john_doe", "password123");

        AuthenticationManager authManager = new AuthenticationManager();
        boolean isAuthenticated = authManager.authenticateUser("john_doe", "password123");
        System.out.println("Is authenticated: " + isAuthenticated);

        // You can add more functionality here as needed
    }
}
