package com.makhdoom.BMS.controllers;

import com.makhdoom.BMS.dtos.BookTicketRequestDto;
import com.makhdoom.BMS.dtos.TicketDto;
import com.makhdoom.BMS.exceptions.ShowSeatNotAvailableException;
import com.makhdoom.BMS.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketDto bookTicket(
            Long showId,
            List<Long> showSeatIds,
            Long userId
    ) throws ShowSeatNotAvailableException {
        BookTicketRequestDto bookTicketRequestDto = new BookTicketRequestDto();
        return this.ticketService.bookTicket(bookTicketRequestDto);
    }
}
