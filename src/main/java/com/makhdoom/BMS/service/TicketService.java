package com.makhdoom.BMS.service;

import com.makhdoom.BMS.dto.BookTicketRequestDto;
import com.makhdoom.BMS.dto.TicketDto;
import com.makhdoom.BMS.model.Ticket;

public interface TicketService {

    Ticket getTicket(Long id);
    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
