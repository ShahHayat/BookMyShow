package com.makhdoom.BMS.controllers;

import com.makhdoom.BMS.models.City;
import com.makhdoom.BMS.services.CityService;
import com.makhdoom.BMS.services.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    private CityService cityService;

    @Autowired
    public CityController(CityServiceImpl cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/city")
    public City addCity(@RequestParam(name = "name") String name) {
        return this.cityService.addCity(name);
    }
}
