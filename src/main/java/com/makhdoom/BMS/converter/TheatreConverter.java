package com.makhdoom.BMS.converter;

import com.makhdoom.BMS.dto.requestdto.TheatreCreationRequestDto;
import com.makhdoom.BMS.dto.responsedto.TheatreResponseDto;
import com.makhdoom.BMS.model.Theatre;
import com.makhdoom.BMS.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
