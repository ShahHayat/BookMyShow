package com.makhdoom.BMS.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "auditorium")
public class Auditorium extends BaseModel {

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "capacity")
    private int capacity;

    @OneToMany (fetch = FetchType.EAGER)
    private List<Seat> seats;

    @ElementCollection
    @Enumerated (EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;

    @ManyToOne
    @JoinColumn (name = "theatre_id")
    private Theatre theatre;
}
