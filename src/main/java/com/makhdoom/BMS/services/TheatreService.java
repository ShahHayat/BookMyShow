package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.requestdto.TheatreCreationRequestDto;
import com.makhdoom.BMS.dtos.responsedto.TheatreResponseDto;

public interface TheatreService {

    TheatreResponseDto addTheatre(TheatreCreationRequestDto theatreCreationRequestDto);
    TheatreResponseDto getTheatre(Long id);
}
