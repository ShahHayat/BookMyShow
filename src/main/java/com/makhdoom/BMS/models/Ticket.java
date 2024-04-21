package com.makhdoom.BMS.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
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
    private Date timeOfBooking;

    @ManyToOne
    private User bookedBy;

    @ManyToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private Show show;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
