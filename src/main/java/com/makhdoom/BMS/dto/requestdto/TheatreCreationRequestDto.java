package com.makhdoom.BMS.dto.requestdto;

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
