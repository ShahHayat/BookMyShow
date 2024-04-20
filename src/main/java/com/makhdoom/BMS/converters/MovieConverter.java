package com.makhdoom.BMS.converters;

import com.makhdoom.BMS.dtos.requestdto.MovieEntryDto;
import com.makhdoom.BMS.dtos.responsedto.MovieResponseDto;
import com.makhdoom.BMS.models.Movie;

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
