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

    private String name;
    private String address;

    @OneToMany
    private List<Auditorium> auditoriums;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "city_id")
    private City city;
}
