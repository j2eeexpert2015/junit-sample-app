package org.junitsample.util;

import org.junit.jupiter.api.Test;
import org.junitsample.model.User;

import static org.junit.jupiter.api.Assertions.*;


public class UserValidatorTest {

    @Test
    void testIsValidUser() {
        UserValidator validator = new UserValidator();
        User user = new User("Bob", 25);
        assertTrue(validator.isValidUser(user));

        user.setName(null);
        assertFalse(validator.isValidUser(user));
    }
}
