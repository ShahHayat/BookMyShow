package com.makhdoom.BMS.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

public class ShowSeatType extends BaseModel {

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    private double price;
}
