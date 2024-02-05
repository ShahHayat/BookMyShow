package com.makhdoom.BMS.converter;

import com.makhdoom.BMS.dto.requestdto.ShowEntryDto;
import com.makhdoom.BMS.dto.responsedto.ShowResponseDto;
import com.makhdoom.BMS.model.Show;

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
