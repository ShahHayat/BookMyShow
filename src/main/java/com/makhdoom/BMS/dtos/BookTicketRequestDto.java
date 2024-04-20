package com.makhdoom.BMS.dtos;

import com.makhdoom.BMS.models.SeatType;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class BookTicketRequestDto {

    private Set<String> requestedSeat;
    private int userId;
    private int showId;
    private SeatType seatType;
}
