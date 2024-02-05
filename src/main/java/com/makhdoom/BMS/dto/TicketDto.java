package com.makhdoom.BMS.dto;

import com.makhdoom.BMS.dto.responsedto.ShowResponseDto;
import com.makhdoom.BMS.dto.responsedto.UserResponseDto;
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
