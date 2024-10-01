package org.junitsample.util;

import org.junitsample.model.User;

public class UserValidator {
    public boolean isValidUser(User user) {
        return user.getName() != null && user.getAge() > 0;
    }
}

