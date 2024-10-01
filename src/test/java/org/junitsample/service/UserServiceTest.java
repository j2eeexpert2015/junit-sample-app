package org.junitsample.service;

import org.junit.jupiter.api.Test;
import org.junitsample.model.User;

import static org.junit.jupiter.api.Assertions.*;


public class UserServiceTest {

    @Test
    void testUserGreeting() {
        UserService userService = new UserService();
        User user = new User("Alice", 17);
        assertEquals("Hello Alice, you're a minor!", userService.getUserGreeting(user));

        user.setAge(20);
        assertEquals("Hello Alice, welcome!", userService.getUserGreeting(user));
    }
}
