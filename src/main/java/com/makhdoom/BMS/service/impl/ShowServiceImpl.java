package com.makhdoom.BMS.service.impl;

import com.makhdoom.BMS.converter.ShowConverter;
import com.makhdoom.BMS.dto.requestdto.ShowEntryDto;
import com.makhdoom.BMS.dto.responsedto.ShowResponseDto;
import com.makhdoom.BMS.exception.ShowNotFoundException;
import com.makhdoom.BMS.model.Auditorium;
import com.makhdoom.BMS.model.Movie;
import com.makhdoom.BMS.model.Show;
import com.makhdoom.BMS.model.Theatre;
import com.makhdoom.BMS.repository.MovieRepository;
import com.makhdoom.BMS.repository.ShowRepository;
import com.makhdoom.BMS.repository.ShowSeatRepository;
import com.makhdoom.BMS.repository.TheatreRepository;
import com.makhdoom.BMS.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ShowServiceImpl implements ShowService {

    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private MovieRepository movieRepository;
    private TheatreRepository theatreRepository;

    @Autowired
    public ShowServiceImpl(ShowRepository showRepository, ShowSeatRepository showSeatRepository, MovieRepository movieRepository, TheatreRepository theatreRepository) {
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.movieRepository = movieRepository;
        this.theatreRepository = theatreRepository;
    }

    @Override
    public ShowResponseDto addShow(ShowEntryDto showEntryDto) {

        Show show = ShowConverter.convertDtoToEntity(showEntryDto);
        Movie movie = movieRepository.findById(showEntryDto.getMovieResponseDto().getId()).get();
        Theatre theatre = theatreRepository.findById(showEntryDto.getTheatreResponseDto().getTheatreId()).get();

        show.setMovie(movie);

        showRepository.save(show);

        generateShowSeats(theatre.getAuditoriums(), show);

        showRepository.save(show);

        return ShowConverter.convertEntityToDto(show);
    }

    private void generateShowSeats(List<Auditorium> auditoriums, Show show) {

        // TODO : Complete this function.
    }

    @Override
    public ShowResponseDto getShow(Long id) {

        Optional<Show> show = showRepository.findById(id);

        if(show.isEmpty())
            throw new ShowNotFoundException("Show with id : " + id + " does not exist.");

        return ShowConverter.convertEntityToDto(show.get());
    }
}
