package com.makhdoom.BMS.models;

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
    private double duration;

    @Column(name = "rating")
    private double rating;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Language> languages;

    @ManyToMany(mappedBy = "movies")
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Genre> genres;
}
