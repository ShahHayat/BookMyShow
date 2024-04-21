package com.makhdoom.BMS.controllers;

import com.makhdoom.BMS.exceptions.CityNotFoundException;
import com.makhdoom.BMS.models.SeatType;
import com.makhdoom.BMS.models.Theatre;
import com.makhdoom.BMS.services.TheatreService;
import com.makhdoom.BMS.services.impl.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller public class TheatreController {

    private TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreServiceImpl theatreService) {
        this.theatreService = theatreService;
    }

    public Theatre createTheatre(String name, String address, Long cityId) {
        Theatre theatre = null;
        try {
            theatre = this.theatreService.createTheatre(name, address, cityId);
        } catch (CityNotFoundException e) {
            System.out.println("Something wrong happened");
        }

        return theatre;
    }

    public Theatre addAuditorium(Long theatreId, String name, int capacity) {
        return theatreService.addAuditorium(theatreId, name, capacity);
    }

    /**
     * In which auditorium
     * you want to add how many seats
     * of what type
     * @param auditoriumId
     * @param seatCount
     */
    public void addSeats(Long auditoriumId, Map<SeatType, Integer> seatCount) {
        theatreService.addSeats(auditoriumId, seatCount);
    }
}
