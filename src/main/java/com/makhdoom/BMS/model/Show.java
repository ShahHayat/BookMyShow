package com.makhdoom.BMS.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "show_")
public class Show extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private LocalTime startTime;

    private LocalTime endTime;

    private LocalDate showDate;

    @ManyToOne
    @JoinColumn(name = "auditorium_id", referencedColumnName = "id")
    private Auditorium auditorium;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> features;
}
