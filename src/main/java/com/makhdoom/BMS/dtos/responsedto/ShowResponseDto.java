package com.makhdoom.BMS.dtos.responsedto;

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
