package com.makhdoom.BMS.dtos.requestdto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheatreCreationRequestDto {

    private Long cityId;
    private String theatreName;
    private String theatreAddress;
}
