package com.makhdoom.BMS.dtos;

import com.makhdoom.BMS.dtos.responsedto.ShowResponseDto;
import com.makhdoom.BMS.dtos.responsedto.UserResponseDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {

    private Long id;
    private String allotedSeats;
    private double amount;
    private UserResponseDto user;
    private ShowResponseDto show;
}
