package com.makhdoom.BMS.repository;

import com.makhdoom.BMS.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
