package com.makhdoom.BMS.services;

import com.makhdoom.BMS.dtos.requestdto.MovieEntryDto;
import com.makhdoom.BMS.dtos.responsedto.MovieResponseDto;

public interface MovieService {

    // Add Movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);

    // Get Movie
    MovieResponseDto getMovie(Long id);
}
