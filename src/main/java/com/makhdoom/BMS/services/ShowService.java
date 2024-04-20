package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.requestdto.ShowEntryDto;
import com.makhdoom.BMS.dtos.responsedto.ShowResponseDto;

public interface ShowService {

    ShowResponseDto addShow(ShowEntryDto showEntryDto);
    ShowResponseDto getShow(Long id);
}
