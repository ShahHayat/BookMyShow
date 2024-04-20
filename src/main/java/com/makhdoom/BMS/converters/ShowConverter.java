package com.makhdoom.BMS.converters;

import com.makhdoom.BMS.dtos.requestdto.ShowEntryDto;
import com.makhdoom.BMS.dtos.responsedto.ShowResponseDto;
import com.makhdoom.BMS.models.Show;

public class ShowConverter {

    public static Show convertDtoToEntity(ShowEntryDto showEntryDto) {
        return Show.builder()
                .startTime(showEntryDto.getShowTime())
                .endTime(showEntryDto.getShowTime().plusHours(3))
                .build();
    }

    public static ShowResponseDto convertEntityToDto(Show show) {
        return ShowResponseDto.builder()
                .id(show.getId())
                .showTime(show.getStartTime())
                .showDate(show.getShowDate())
                .build();
    }
}
