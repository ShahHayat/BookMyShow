package com.makhdoom.BMS.controllers;

import com.makhdoom.BMS.services.ShowService;
import com.makhdoom.BMS.services.impl.ShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShowController {

    private ShowService showService;

    @Autowired
    public ShowController(ShowServiceImpl showService) {
        this.showService = showService;
    }
}
