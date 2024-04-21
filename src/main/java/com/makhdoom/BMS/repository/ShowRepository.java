package com.makhdoom.BMS.repository;

import com.makhdoom.BMS.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show, Long> {

    Optional<Show> findById(Long id);
}
