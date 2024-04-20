package com.makhdoom.BMS.services;

import com.makhdoom.BMS.models.City;

public interface CityService {

    City addCity(String name);
    City getCity(Long id);
}
