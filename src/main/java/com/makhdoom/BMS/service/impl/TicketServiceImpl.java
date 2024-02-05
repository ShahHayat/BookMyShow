package com.makhdoom.BMS.service.impl;

import com.makhdoom.BMS.dto.BookTicketRequestDto;
import com.makhdoom.BMS.dto.TicketDto;
import com.makhdoom.BMS.model.Ticket;
import com.makhdoom.BMS.repository.ShowRepository;
import com.makhdoom.BMS.repository.TicketRepository;
import com.makhdoom.BMS.repository.UserRepository;
import com.makhdoom.BMS.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;
    private UserRepository userRepository;
    private ShowRepository showRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository, UserRepository userRepository, ShowRepository showRepository) {
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
        this.showRepository = showRepository;
    }

    @Override
    public Ticket getTicket(Long id) {
        // TODO : Complete this function.
        return null;
    }

    @Override
    public TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto) {
        // TODO : Complete this function.
        return null;
    }
}
