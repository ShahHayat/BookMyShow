package com.makhdoom.BMS.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "theatre")
public class Theatre extends BaseModel {

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "address", nullable = false)
    private String address;

    @OneToMany (mappedBy = "theatre", fetch = FetchType.EAGER)
    private List<Auditorium> auditoriums;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "city_id")
    private City city;

    @OneToMany
    private List<Show> upcomingShows;
}
