package com.makhdoom.BMS.converters;

import com.makhdoom.BMS.dtos.requestdto.TheatreCreationRequestDto;
import com.makhdoom.BMS.dtos.responsedto.TheatreResponseDto;
import com.makhdoom.BMS.models.Theatre;

public class TheatreConverter {

    public static Theatre convertDtoToEntity(TheatreCreationRequestDto theatreCreationRequestDto) {
        return Theatre.builder()
                .name(theatreCreationRequestDto.getTheatreName())
                .address(theatreCreationRequestDto.getTheatreAddress())
                .build();
    }

    public static TheatreResponseDto convertEntityToDto(Theatre theatre) {
        return TheatreResponseDto.builder()
                .theatreName(theatre.getName())
                .theatreAddress(theatre.getAddress())
                .cityName(theatre.getCity().getName())
                .build();
    }
}
