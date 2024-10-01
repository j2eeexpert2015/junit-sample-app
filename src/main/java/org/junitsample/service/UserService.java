package org.junitsample.service;


import org.junitsample.model.User;

public class UserService {
    public String getUserGreeting(User user) {
        if (user.getAge() < 18) {
            return "Hello " + user.getName() + ", you're a minor!";
        }
        return "Hello " + user.getName() + ", welcome!";
    }
}

