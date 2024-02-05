package com.makhdoom.BMS.dto.responsedto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieResponseDto {

    Long id;
    String name;
    String duration;
    LocalDate releaseDate;

    // Optional
    List<ShowResponseDto> showList;
}
