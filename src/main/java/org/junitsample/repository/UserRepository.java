package org.junitsample.repository;

import org.junitsample.model.User;

public class UserRepository {
    public User findUserByName(String name) {
        // Simulating a user being fetched from the database
        return new User(name, 25); // Sample user returned
    }
}
