package com.makhdoom.BMS.converter;

import com.makhdoom.BMS.dto.requestdto.UserEntryDto;
import com.makhdoom.BMS.dto.responsedto.UserResponseDto;
import com.makhdoom.BMS.model.User;

public class UserConverter {

    public static User convertDtoToEntity(UserEntryDto userEntryDto) {
        return User.builder()
                .userName(userEntryDto.getName())
                .mobileNumber(userEntryDto.getMobileNumber())
                .build();
    }

    public static UserResponseDto convertEntityToDto(User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .name(user.getUserName())
                .build();
    }
}
