package com.makhdoom.BMS.services.impl;

import com.makhdoom.BMS.dtos.BookTicketRequestDto;
import com.makhdoom.BMS.dtos.TicketDto;
import com.makhdoom.BMS.models.Ticket;
import com.makhdoom.BMS.repository.ShowRepository;
import com.makhdoom.BMS.repository.TicketRepository;
import com.makhdoom.BMS.repository.UserRepository;
import com.makhdoom.BMS.services.TicketService;
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
