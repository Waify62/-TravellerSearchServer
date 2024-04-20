package com.cyberhuskies.controller;

import com.cyberhuskies.domain.User;
import com.cyberhuskies.service.UserService;
import com.cyberhuskies.service.UserServiceImpl;

public class UserController {
    private final UserService userService;

    public UserController(){
        userService=new UserServiceImpl();
    }
}
