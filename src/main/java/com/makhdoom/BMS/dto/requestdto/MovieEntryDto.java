package com.makhdoom.BMS.dto.requestdto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntryDto {

    private String name;
    private String duration;
    private LocalDate releaseDate;
}
