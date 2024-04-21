package com.makhdoom.BMS.repository;

import com.makhdoom.BMS.models.ShowSeat;
import jakarta.persistence.LockModeType;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({
            @QueryHint(name = "javax.persistence.lock.timeout", value = "30000")
    })
    List<ShowSeat> findByIdIn(List<Long> showSeatIds);

//    SELECT * FROM show_seats
//    WHERE show_seat id IN ()
//    for update;

//    @Query("select * from show_seat_mapping where show_seat_mapping.seat_id in ()")
//    List<ShowSeat> findByIdIn(List<Long> showSeatIds);

    ShowSeat save(ShowSeat showSeat);
}
