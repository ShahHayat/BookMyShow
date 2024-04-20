package com.makhdoom.BMS.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "seat")
public class Seat extends BaseModel {

    private String seatNumber;

    @Column(name = "seat_row")
    private int row;

    @Column(name = "seat_column")
    private int column;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
