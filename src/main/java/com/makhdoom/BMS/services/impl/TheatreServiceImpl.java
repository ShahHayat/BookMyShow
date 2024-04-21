package com.makhdoom.BMS.services.impl;

import com.makhdoom.BMS.exceptions.CityNotFoundException;
import com.makhdoom.BMS.models.*;
import com.makhdoom.BMS.repository.AuditoriumRepository;
import com.makhdoom.BMS.repository.CityRepository;
import com.makhdoom.BMS.repository.SeatRepository;
import com.makhdoom.BMS.repository.TheatreRepository;
import com.makhdoom.BMS.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TheatreServiceImpl implements TheatreService {

    private TheatreRepository theatreRepository;
    private CityRepository cityRepository;
    private AuditoriumRepository auditoriumRepository;
    private SeatRepository seatRepository;

    @Autowired
    public TheatreServiceImpl(TheatreRepository theatreRepository,
                          CityRepository cityRepository,
                          AuditoriumRepository auditoriumRepository,
                          SeatRepository seatRepository) {
        this.theatreRepository = theatreRepository;
        this.cityRepository = cityRepository;
        this.auditoriumRepository = auditoriumRepository;
        this.seatRepository = seatRepository;
    }

    @Override
    public Theatre createTheatre(
            String name,
            String address,
            Long cityId
    ) throws CityNotFoundException {

        // Check if the city with that ID exists
        Optional<City> cityOptional = cityRepository.findById(cityId);
        if (cityOptional.isEmpty()) {
            throw new CityNotFoundException("No city with given ID");
        }

        // Create a theatre object
        Theatre theatre = new Theatre();
        theatre.setName(name);
        theatre.setAddress(address);

        // save it in the database
        Theatre savedTheatre = theatreRepository.save(theatre);

        // Fetch the city for the id
        City dbCity = cityOptional.get();

        // Add the theatre to the city
        if (dbCity.getTheatres() == null) {
            dbCity.setTheatres(new ArrayList<>());
        }
        dbCity.getTheatres().add(savedTheatre);

        // Update the city in the database
        this.cityRepository.save(dbCity);

        return savedTheatre;
    }

    @Override
    public Theatre addAuditorium(Long theatreId, String name, int capacity) {

        Theatre theatre = theatreRepository.findById(theatreId).get();

        Auditorium auditorium = new Auditorium();
        auditorium.setName(name);
        auditorium.setCapacity(capacity);
        auditorium.setTheatre(theatre);

        Auditorium savedAuditorium = auditoriumRepository.save(auditorium);

        theatre.getAuditoriums().add(savedAuditorium);

        return theatreRepository.save(theatre);
    }

    // VIP: 10
    // PREMIUM: 20
    // GOLD: 50
    @Override
    public void addSeats(
            Long auditoriumId,
            Map<SeatType, Integer> seatCount
    ) {
        Auditorium auditorium = auditoriumRepository.findById(auditoriumId).get();

        List<Seat> seats = new ArrayList<>();

        for (Map.Entry<SeatType, Integer> entry : seatCount.entrySet()) {
            for (int i = 0; i < entry.getValue(); ++i) {
                Seat seat = new Seat();
                seat.setSeatType(entry.getKey());
                // VIP1 VIP2 VIP3
                // PREMIUM1 PREMIUM2 PREMIUM3
                seat.setSeatNumber(entry.getKey().toString() + Integer.toString(i + 1));
                seats.add(seat);
            }
        }

        List<Seat> savedSeats = seatRepository.saveAll(seats);

        auditorium.setSeats(savedSeats);

        auditoriumRepository.save(auditorium);
    }
}
