package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.requestdto.UserEntryDto;
import com.makhdoom.BMS.dtos.responsedto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto addUser(UserEntryDto userEntryDto);
    UserResponseDto getUser(Long id);
    List<UserResponseDto> getAllUser();
}
