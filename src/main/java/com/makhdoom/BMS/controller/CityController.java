package com.makhdoom.BMS.controller;

import com.makhdoom.BMS.model.City;
import com.makhdoom.BMS.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    private CityServiceImpl cityServiceImpl;

    @Autowired
    public CityController(CityServiceImpl cityServiceImpl) {
        this.cityServiceImpl = cityServiceImpl;
    }

    @PostMapping("/city")
    public City addCity(@RequestParam(name = "name") String name) {
        return this.cityServiceImpl.addCity(name);
    }
}
