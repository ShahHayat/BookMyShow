package com.makhdoom.BMS.dtos.responsedto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheatreResponseDto {

    private Long theatreId;
    private String theatreName;
    private String theatreAddress;
    private String cityName;
}
