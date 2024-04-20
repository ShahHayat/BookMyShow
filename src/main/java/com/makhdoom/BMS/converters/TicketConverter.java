package com.makhdoom.BMS.converters;

import com.makhdoom.BMS.dtos.TicketDto;
import com.makhdoom.BMS.models.Ticket;

public class TicketConverter {

    public static TicketDto convertEntityToDto(Ticket ticket) {

        return TicketDto.builder()
                .id(ticket.getId())
                .amount(ticket.getTotalAmount())
                .allotedSeats(ticket.getShowSeats().toString())
                .build();
    }
}
