package com.makhdoom.BMS.service;

import com.makhdoom.BMS.dto.requestdto.UserEntryDto;
import com.makhdoom.BMS.dto.responsedto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto addUser(UserEntryDto userEntryDto);
    UserResponseDto getUser(Long id);
    List<UserResponseDto> getAllUser();
}
