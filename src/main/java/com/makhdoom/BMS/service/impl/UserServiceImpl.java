package com.makhdoom.BMS.service.impl;

import com.makhdoom.BMS.dto.requestdto.UserEntryDto;
import com.makhdoom.BMS.dto.responsedto.UserResponseDto;
import com.makhdoom.BMS.repository.UserRepository;
import com.makhdoom.BMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto addUser(UserEntryDto userEntryDto) {
        // TODO : Complete this function.
        return null;
    }

    @Override
    public UserResponseDto getUser(Long id) {
        // TODO : Complete this function.
        return null;
    }

    @Override
    public List<UserResponseDto> getAllUser() {
        // TODO : Complete this function.
        return null;
    }
}
