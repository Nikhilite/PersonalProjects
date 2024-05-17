package codeFiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("john_doe", "password123", "john@example.com");
    }

    @Test
    public void testGetUsername() {
        assertEquals("john_doe", user.getUsername());
    }

    @Test
    public void testGetPassword() {
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testGetEmail() {
        assertEquals("john@example.com", user.getEmail());
    }

    

	@Test
    public void testSetUsername() {
        user.setUsername("jane_doe");
        assertEquals("jane_doe", user.getUsername());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("new_password");
        assertEquals("new_password", user.getPassword());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("jane@example.com");
        assertEquals("jane@example.com", user.getEmail());
    }

    @Test
    public void testUpdateSettings() {
        user.updateSettings("theme", "dark");
        user.updateSettings("language", "English");
        Map<String, String> expectedSettings = new HashMap<>();
        expectedSettings.put("theme", "dark");
        expectedSettings.put("language", "English");
        assertEquals(expectedSettings, user.getSettings());
    }
}
