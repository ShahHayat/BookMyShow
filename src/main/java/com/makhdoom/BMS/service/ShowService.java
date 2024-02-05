package com.makhdoom.BMS.service;

import com.makhdoom.BMS.dto.requestdto.ShowEntryDto;
import com.makhdoom.BMS.dto.responsedto.ShowResponseDto;

public interface ShowService {

    ShowResponseDto addShow(ShowEntryDto showEntryDto);
    ShowResponseDto getShow(Long id);
}
