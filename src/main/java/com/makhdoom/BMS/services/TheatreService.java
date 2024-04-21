package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.requestdto.TheatreCreationRequestDto;
import com.makhdoom.BMS.dtos.responsedto.TheatreResponseDto;
import com.makhdoom.BMS.models.SeatType;
import com.makhdoom.BMS.models.Theatre;

import java.util.Map;

public interface TheatreService {

    public Theatre createTheatre(String name, String address, Long cityId);
    public Theatre addAuditorium(Long theatreId, String name, int capacity);
    public void addSeats(Long auditoriumId, Map<SeatType, Integer> seatCount);
}
