package org.junitsample.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    @Test
    void getUserGreeting() {
        UserController userController = new UserController();
        String greeting = userController.getUserGreeting("John");

        assertNotNull(greeting);
        assertTrue(greeting.contains("John"));
    }
    @Test
    void getUserGreetingForFailure() {
        UserController userController = new UserController();
        String greeting = userController.getUserGreeting("John");

        assertNotNull(greeting);
        assertTrue(greeting.contains("John"));
    }
}