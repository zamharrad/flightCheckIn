package com.raad.flightcheckin.integration;

import com.raad.flightcheckin.dto.Reservation;
import com.raad.flightcheckin.dto.ReservationUpdateRequeset;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

    private static final String RESERVATION_REST_URL = "http://localhost:8080/flightreservation/reservations/";

    @Override
    public Reservation findReservation(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);
        return reservation;
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequeset requeset) {
        RestTemplate restTemplate = new RestTemplate();
        Reservation reservaton = restTemplate.postForObject(RESERVATION_REST_URL, requeset, Reservation.class);
        Logger logger = Logger.getLogger(RESERVATION_REST_URL);
        return reservaton;
    }
}
