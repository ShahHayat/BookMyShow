package com.makhdoom.BMS.service.impl;

import com.makhdoom.BMS.exception.CityNotFoundException;
import com.makhdoom.BMS.model.City;
import com.makhdoom.BMS.repository.CityRepository;
import com.makhdoom.BMS.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City addCity(String name) {
        City newCity = new City();
        newCity.setName(name);
        return this.cityRepository.save(newCity);
    }

    @Override
    public City getCity(Long id) {
        Optional<City> city = cityRepository.findById(id);

        if (city.isEmpty())
            throw new CityNotFoundException("City id you entered is not present.");

        return city.get();
    }
}
