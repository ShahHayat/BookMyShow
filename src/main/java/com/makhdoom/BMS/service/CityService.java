package com.makhdoom.BMS.service;

import com.makhdoom.BMS.model.City;

public interface CityService {

    City addCity(String name);
    City getCity(Long id);
}
