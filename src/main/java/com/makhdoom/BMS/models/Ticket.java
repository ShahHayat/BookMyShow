package com.makhdoom.BMS.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ticket")
public class Ticket extends BaseModel {

    private double totalAmount;
    private LocalDateTime bookingTime;

    @ManyToOne
    private User bookedBy;

    @ManyToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private Show showMovie;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
