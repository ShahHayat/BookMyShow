package com.makhdoom.BMS.controllers;

import com.makhdoom.BMS.exceptions.ShowSeatNotAvailableException;
import com.makhdoom.BMS.models.Ticket;
import com.makhdoom.BMS.services.TicketService;
import com.makhdoom.BMS.services.impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketServiceImpl ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket bookTicket(Long showId, List<Long> showSeatIds, Long userId) throws ShowSeatNotAvailableException {
        return this.ticketService.bookTicket(showId, showSeatIds, userId);
    }
}
