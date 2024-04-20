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
@Table(name = "city")
public class City extends BaseModel {

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany (mappedBy = "city", fetch = FetchType.EAGER)
    private List<Theatre> theatres;
}
