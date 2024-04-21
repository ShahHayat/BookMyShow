package com.makhdoom.BMS.services.impl;

import com.makhdoom.BMS.converters.UserConverter;
import com.makhdoom.BMS.dtos.responsedto.UserResponseDto;
import com.makhdoom.BMS.models.User;
import com.makhdoom.BMS.repository.UserRepository;
import com.makhdoom.BMS.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto createUser(String email) {

        User user = new User();
        user.setEmail(email);

        User savedUser = userRepository.save(user);

        return UserConverter.convertEntityToDto(savedUser);
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
