package com.makhdoom.BMS.dto.responsedto;

import com.makhdoom.BMS.dto.TicketDto;
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
