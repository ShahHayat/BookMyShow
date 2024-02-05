package com.makhdoom.BMS.service.impl;

import com.makhdoom.BMS.converter.MovieConverter;
import com.makhdoom.BMS.dto.requestdto.MovieEntryDto;
import com.makhdoom.BMS.dto.responsedto.MovieResponseDto;
import com.makhdoom.BMS.exception.MovieNotFoundException;
import com.makhdoom.BMS.model.Movie;
import com.makhdoom.BMS.repository.MovieRepository;
import com.makhdoom.BMS.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Component
@Slf4j
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieResponseDto addMovie(MovieEntryDto movieEntryDto) {

        log.info("Adding the movie", movieEntryDto);

        Movie movie = MovieConverter.convertDtoToEntity(movieEntryDto);
        movieRepository.save(movie);

        return MovieConverter.convertEntityToDto(movie);
    }

    @Override
    public MovieResponseDto getMovie(Long id) {

        Optional<Movie> movie = movieRepository.findById(id);

        if(movie.isEmpty())
            throw new MovieNotFoundException("There is no movie with the given id : " + id);

        return MovieConverter.convertEntityToDto(movie.get());
    }
}
