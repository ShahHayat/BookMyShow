package com.makhdoom.BMS.dto.responsedto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowResponseDto {

    Long id;
    LocalDate showDate;
    LocalTime showTime;

    MovieResponseDto movie;

    TheatreResponseDto theatre;
}
