package com.makhdoom.BMS.dtos.responsedto;

import com.makhdoom.BMS.dtos.TicketDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponseDto {

    private Long id;
    private String name;
    private String mobileNumber;
    private List<TicketDto> tickets;
}
