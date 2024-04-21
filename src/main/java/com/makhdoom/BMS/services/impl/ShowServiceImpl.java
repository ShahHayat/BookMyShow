package com.makhdoom.BMS.services.impl;

import com.makhdoom.BMS.converters.ShowConverter;
import com.makhdoom.BMS.dtos.requestdto.ShowEntryDto;
import com.makhdoom.BMS.dtos.responsedto.ShowResponseDto;
import com.makhdoom.BMS.exceptions.ShowNotFoundException;
import com.makhdoom.BMS.models.*;
import com.makhdoom.BMS.repository.*;
import com.makhdoom.BMS.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class ShowServiceImpl implements ShowService {

    private AuditoriumRepository auditoriumRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;

    @Autowired
    public ShowServiceImpl(AuditoriumRepository auditoriumRepository,
                       ShowRepository showRepository,
                       ShowSeatRepository showSeatRepository) {
        this.auditoriumRepository = auditoriumRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }

    @Override
    public Show createShow(
            Long movieId,
            Date startTime,
            Date endTime,
            Long auditoriumId,
            Map<SeatType, Integer> seatPricing,
            Language language
    ) {
        Show show = new Show();
        show.setStartTime(startTime);
        show.setEndTime(endTime);
        show.setLanguage(language);

        Auditorium auditorium = auditoriumRepository.findById(auditoriumId).get();
        show.setAuditorium(auditorium);
        Show savedShow = showRepository.save(show);
        List<ShowSeat> savedShowSeats = new ArrayList<>();

        for (Seat seat: auditorium.getSeats()) {
            ShowSeat showSeat = new ShowSeat();
            showSeat.setShow(savedShow);
            showSeat.setSeat(seat);
            showSeat.setState(ShowSeatState.AVAILABLE);
            savedShowSeats.add(showSeatRepository.save(showSeat));
        }

        savedShow.setShowSeats(savedShowSeats);

        return showRepository.save(savedShow);
    }
}
