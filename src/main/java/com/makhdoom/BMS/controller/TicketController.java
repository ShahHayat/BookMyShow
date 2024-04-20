package com.makhdoom.BMS.controller;

import com.makhdoom.BMS.dto.BookTicketRequestDto;
import com.makhdoom.BMS.dto.TicketDto;
import com.makhdoom.BMS.exception.ShowSeatNotAvailableException;
import com.makhdoom.BMS.service.TicketService;
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
