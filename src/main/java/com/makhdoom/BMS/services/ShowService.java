package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.requestdto.ShowEntryDto;
import com.makhdoom.BMS.dtos.responsedto.ShowResponseDto;
import com.makhdoom.BMS.models.Language;
import com.makhdoom.BMS.models.SeatType;
import com.makhdoom.BMS.models.Show;

import java.util.Date;
import java.util.Map;

public interface ShowService {

    public Show createShow(
            Long movieId,
            Date startTime,
            Date endTime,
            Long auditoriumId,
            Map<SeatType, Integer> seatPricing,
            Language language
    );
}
