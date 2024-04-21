package com.makhdoom.BMS.controllers;

import com.makhdoom.BMS.models.Language;
import com.makhdoom.BMS.models.SeatType;
import com.makhdoom.BMS.models.Show;
import com.makhdoom.BMS.services.ShowService;
import com.makhdoom.BMS.services.impl.ShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Map;

@Controller
public class ShowController {

    private ShowService showService;

    @Autowired
    public ShowController(ShowServiceImpl showService) {
        this.showService = showService;
    }
    public Show createShow(
            Long movieId,
            Date startTime,
            Date endTime,
            Long auditoriumId,
            Map<SeatType, Integer> seatPricing,
            Language language
    ) {
        return showService.createShow(
                movieId, startTime, endTime, auditoriumId, seatPricing, language);
    }

}
