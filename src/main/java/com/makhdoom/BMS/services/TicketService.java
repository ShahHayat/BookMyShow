package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.BookTicketRequestDto;
import com.makhdoom.BMS.dtos.TicketDto;
import com.makhdoom.BMS.models.Ticket;

public interface TicketService {

    Ticket getTicket(Long id);
    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
