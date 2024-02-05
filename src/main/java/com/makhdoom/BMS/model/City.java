package com.makhdoom.BMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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

    private String name;

    @OneToMany (mappedBy = "city", fetch = FetchType.LAZY)
    private List<Theatre> theatres;
}
