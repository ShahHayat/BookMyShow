package com.makhdoom.BMS.service;

import com.makhdoom.BMS.dto.requestdto.MovieEntryDto;
import com.makhdoom.BMS.dto.responsedto.MovieResponseDto;

public interface MovieService {

    // Add Movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);

    // Get Movie
    MovieResponseDto getMovie(Long id);
}
