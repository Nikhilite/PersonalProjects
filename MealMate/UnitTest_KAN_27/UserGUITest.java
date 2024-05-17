package codeFiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import codeFiles.User;
import codeFiles.UserService;
import codeFiles.UserGUI;

public class UserGUITest extends ApplicationTest {
    private UserGUI userGUI;
    private UserService userService;

    @Override
    public void start(Stage stage) {
        userGUI = new UserGUI();
        userGUI.start(stage);
    }

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testRegistration() {
        // Switch to registration scene
        clickOn("#switchToRegisterButton");

        // Fill registration form
        TextField usernameField = lookup("#usernameField").query();
        TextField passwordField = lookup("#passwordField").query();
        TextField emailField = lookup("#emailField").query();
        clickOn(usernameField).write("testuser");
        clickOn(passwordField).write("password123");
        clickOn(emailField).write("test@example.com");

        // Click register button
        Button registerButton = lookup("#registerButton").query();
        clickOn(registerButton);

        // Check if user is registered
        User user = userService.login("testuser", "password123");
        assertNotNull(user);
        assertEquals("test@example.com", user.getEmail());
    }

    @Test
    public void testLogin() {
        // Register a user
        userService.register("testuser", "password123", "test@example.com");

        // Switch to login scene
        clickOn("#switchToLoginButton");

        // Fill login form
        TextField loginUsernameField = lookup("#loginUsernameField").query();
        TextField loginPasswordField = lookup("#loginPasswordField").query();
        clickOn(loginUsernameField).write("testuser");
        clickOn(loginPasswordField).write("password123");

        // Click login button
        Button loginButton = lookup("#loginButton").query();
        clickOn(loginButton);

        // Check if login is successful
        assertTrue(lookup("Logged in successfully as testuser").tryQuery().isPresent());
    }
}

