package com.makhdoom.BMS.converters;

import com.makhdoom.BMS.dtos.requestdto.UserEntryDto;
import com.makhdoom.BMS.dtos.responsedto.UserResponseDto;
import com.makhdoom.BMS.models.User;

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
