package com.makhdoom.BMS.controllers;

import com.makhdoom.BMS.dtos.requestdto.UserEntryDto;
import com.makhdoom.BMS.dtos.responsedto.UserResponseDto;
import com.makhdoom.BMS.services.UserService;
import com.makhdoom.BMS.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserResponseDto createUser(UserEntryDto request) {
        UserResponseDto savedUser = userService.createUser(
                request.getEmail()
        );

        return savedUser;
    }
}
