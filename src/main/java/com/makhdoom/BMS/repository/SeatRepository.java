package com.makhdoom.BMS.repository;

import com.makhdoom.BMS.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
