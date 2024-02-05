package com.makhdoom.BMS.converter;

import com.makhdoom.BMS.dto.TicketDto;
import com.makhdoom.BMS.model.Ticket;

public class TicketConverter {

    public static TicketDto convertEntityToDto(Ticket ticket) {

        return TicketDto.builder()
                .id(ticket.getId())
                .amount(ticket.getTotalAmount())
                .allotedSeats(ticket.getShowSeats().toString())
                .build();
    }
}
