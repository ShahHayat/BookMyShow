package com.makhdoom.BMS.dtos.requestdto;

import com.makhdoom.BMS.dtos.responsedto.MovieResponseDto;
import com.makhdoom.BMS.dtos.responsedto.TheatreResponseDto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowEntryDto {

    private LocalDate showDate;
    private LocalTime showTime;
    private MovieResponseDto movieResponseDto;
    private TheatreResponseDto theatreResponseDto;
}
