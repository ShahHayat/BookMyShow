package com.makhdoom.BMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "actor")
public class Actor extends BaseModel {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;
}
