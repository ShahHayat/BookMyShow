package com.makhdoom.BMS.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "movie")
public class Movie extends BaseModel {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "release_date", columnDefinition = "DATE", nullable = false)
    private LocalDate releaseDate;

    @Column(name = "duration", nullable = false)
    private String duration;

    @ManyToMany
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> features;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Genre> genres;
}
