package com.makhdoom.BMS.services.impl;

import com.makhdoom.BMS.converters.TheatreConverter;
import com.makhdoom.BMS.dtos.requestdto.TheatreCreationRequestDto;
import com.makhdoom.BMS.dtos.responsedto.TheatreResponseDto;
import com.makhdoom.BMS.exceptions.CityNotFoundException;
import com.makhdoom.BMS.exceptions.TheatreNotFoundException;
import com.makhdoom.BMS.models.City;
import com.makhdoom.BMS.models.Theatre;
import com.makhdoom.BMS.repository.CityRepository;
import com.makhdoom.BMS.repository.TheatreRepository;
import com.makhdoom.BMS.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TheatreServiceImpl implements TheatreService {

    private TheatreRepository theatreRepository;
    private CityRepository cityRepository;

    @Autowired
    public TheatreServiceImpl(TheatreRepository theatreRepository, CityRepository cityRepository) {
        this.theatreRepository = theatreRepository;
        this.cityRepository = cityRepository;
    }

    public TheatreResponseDto addTheatre(TheatreCreationRequestDto theatreCreationRequestDto) {

        String name = theatreCreationRequestDto.getTheatreName();
        String address = theatreCreationRequestDto.getTheatreAddress();
        Long cityId = theatreCreationRequestDto.getCityId();

        Optional<City> cityOptional = cityRepository.findById(cityId);

        if(cityOptional.isEmpty()) {
            throw new CityNotFoundException("City not found with id : " + cityId);
        }

        Theatre theatre = new Theatre();
        theatre.setName(name);
        theatre.setAddress(address);
        theatre.setCity(cityOptional.get());

        Theatre savedTheatre = theatreRepository.save(theatre);

        City dbCity = cityOptional.get();

        if(dbCity.getTheatres() == null) {
            dbCity.setTheatres(new ArrayList<>());
        }

        dbCity.getTheatres().add(theatre);
        this.cityRepository.save(dbCity);

        return TheatreConverter.convertEntityToDto(savedTheatre);
    }

    @Override
    public TheatreResponseDto getTheatre(Long id) {

        Optional<Theatre> theatre = theatreRepository.findById(id);

        if (theatre.isEmpty())
            throw new TheatreNotFoundException("Theatre with id : " + id + " is not found.");

        return TheatreConverter.convertEntityToDto(theatre.get());
    }
}
