package com.makhdoom.BMS.converter;

import com.makhdoom.BMS.dto.requestdto.MovieEntryDto;
import com.makhdoom.BMS.dto.responsedto.MovieResponseDto;
import com.makhdoom.BMS.model.Movie;

public class MovieConverter {

    public static Movie convertDtoToEntity (MovieEntryDto movieEntryDto) {
        return Movie.builder()
                .name(movieEntryDto.getName())
                .releaseDate(movieEntryDto.getReleaseDate())
                .build();
    }

    public static MovieResponseDto convertEntityToDto(Movie movie) {
        return MovieResponseDto.builder()
                .id(movie.getId())
                .name(movie.getName())
                .releaseDate(movie.getReleaseDate())
                .duration(movie.getDuration())
                .build();
    }
}
