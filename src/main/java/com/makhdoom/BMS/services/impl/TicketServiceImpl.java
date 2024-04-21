package com.makhdoom.BMS.services.impl;

import com.makhdoom.BMS.dtos.BookTicketRequestDto;
import com.makhdoom.BMS.dtos.TicketDto;
import com.makhdoom.BMS.exceptions.ShowSeatNotAvailableException;
import com.makhdoom.BMS.models.ShowSeat;
import com.makhdoom.BMS.models.ShowSeatState;
import com.makhdoom.BMS.models.Ticket;
import com.makhdoom.BMS.models.TicketStatus;
import com.makhdoom.BMS.repository.ShowRepository;
import com.makhdoom.BMS.repository.ShowSeatRepository;
import com.makhdoom.BMS.repository.TicketRepository;
import com.makhdoom.BMS.repository.UserRepository;
import com.makhdoom.BMS.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public class TicketServiceImpl implements TicketService {

    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;
    private ShowRepository showRepository;

    @Autowired
    public TicketServiceImpl(
            ShowSeatRepository showSeatRepository,
            UserRepository userRepository,
            ShowRepository showRepository
    ) {
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
        this.showRepository = showRepository;
    }

    @Override
    public Ticket getTicket(Long id) {

        // TODO: Implement this method.
        return null;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override
    public Ticket bookTicket(
            Long showId,
            List<Long> showSeatIds,
            Long userId
    ) throws ShowSeatNotAvailableException {
        // Fetch given ShowSeats
        List<ShowSeat> showSeats = showSeatRepository.findByIdIn(showSeatIds);

        // Check if each of them are available
        for (ShowSeat showSeat: showSeats) {
            if (showSeat.getState() != ShowSeatState.AVAILABLE) {
                throw new ShowSeatNotAvailableException("ShowSeat ID: " +
                        showSeat.getId() + " not available.");
            }
        }

        // Update status to locked
        for (ShowSeat showSeat: showSeats) {
            showSeat.setState(ShowSeatState.LOCKED);
            showSeatRepository.save(showSeat);
        }

        // Return the Ticket object
        Ticket ticket = new Ticket();
        ticket.setTicketStatus(TicketStatus.PENDING);
        ticket.setBookedBy(userRepository.findById(userId).get());
        ticket.setShow(showRepository.findById(showId).get());
        ticket.setShowSeats(showSeats);
        ticket.setTimeOfBooking(new Date());


        return ticket;
    }
}
