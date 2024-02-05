package com.makhdoom.BMS.service;

import com.makhdoom.BMS.dto.requestdto.TheatreCreationRequestDto;
import com.makhdoom.BMS.dto.responsedto.TheatreResponseDto;

public interface TheatreService {

    TheatreResponseDto addTheatre(TheatreCreationRequestDto theatreCreationRequestDto);
    TheatreResponseDto getTheatre(Long id);
}
