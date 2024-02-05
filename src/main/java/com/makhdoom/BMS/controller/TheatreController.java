package com.makhdoom.BMS.controller;

import com.makhdoom.BMS.dto.requestdto.TheatreCreationRequestDto;
import com.makhdoom.BMS.dto.responsedto.TheatreResponseDto;
import com.makhdoom.BMS.model.Theatre;
import com.makhdoom.BMS.service.impl.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreController {

    private TheatreServiceImpl theatreServiceImpl;

    @Autowired
    public TheatreController(TheatreServiceImpl theatreServiceImpl) {
        this.theatreServiceImpl = theatreServiceImpl;
    }

    @PostMapping("/theatre")
    public TheatreResponseDto createTheatre(@RequestBody TheatreCreationRequestDto theatreCreationRequestDto) {
        return theatreServiceImpl.addTheatre(theatreCreationRequestDto);
    }
}
