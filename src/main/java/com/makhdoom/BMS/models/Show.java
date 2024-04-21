package com.makhdoom.BMS.models;

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

    private Date startTime;

    private Date endTime;

    private LocalDate showDate;

    @ManyToOne
    @JoinColumn(name = "auditorium_id", referencedColumnName = "id")
    private Auditorium auditorium;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats;

    @OneToMany(mappedBy = "show")
    private List<ShowSeatType> showSeatTypes;

    @Enumerated(EnumType.STRING)
    private Language language;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ShowFeature> showFeatures;
}
