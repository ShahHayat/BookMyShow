package com.makhdoom.BMS.repository;

import com.makhdoom.BMS.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
