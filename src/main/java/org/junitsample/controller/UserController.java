package org.junitsample.controller;


import org.junitsample.model.User;
import org.junitsample.repository.UserRepository;
import org.junitsample.service.UserService;

public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    public UserController() {
        this.userService = new UserService();
        this.userRepository = new UserRepository();
    }

    public String getUserGreeting(String userName) {
        User user = userRepository.findUserByName(userName);
        return userService.getUserGreeting(user);
    }
}

