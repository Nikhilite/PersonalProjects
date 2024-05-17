package codeFiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import codeFiles.User;
import codeFiles.UserService;

public class UserServiceTest {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testRegisterUser() {
        userService.register("testuser", "password123", "test@example.com");
        assertNotNull(userService.login("testuser", "password123"));
    }

    @Test
    public void testLogin() {
        userService.register("testuser", "password123", "test@example.com");
        assertNotNull(userService.login("testuser", "password123"));
    }

    @Test
    public void testInvalidLogin() {
        assertNull(userService.login("nonexistentuser", "wrongpassword"));
    }

    @Test
    public void testUpdateSettings() {
        userService.register("testuser", "password123", "test@example.com");
        User user = userService.login("testuser", "password123");
        assertNotNull(user);
        userService.updateSettings(user, "theme", "dark");
        assertEquals("dark", user.getSettings().get("theme"));
    }
}
