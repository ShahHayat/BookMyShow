package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.BookTicketRequestDto;
import com.makhdoom.BMS.dtos.TicketDto;
import com.makhdoom.BMS.models.Ticket;

import java.util.List;

public interface TicketService {

    Ticket getTicket(Long id);
    public Ticket bookTicket(Long showId, List<Long> showSeatIds, Long userId);
}
