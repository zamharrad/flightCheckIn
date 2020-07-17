package com.raad.flightcheckin.integration;

import com.raad.flightcheckin.dto.Reservation;
import com.raad.flightcheckin.dto.ReservationUpdateRequeset;

public interface ReservationRestClient {

    public Reservation findReservation(Long id);

    public Reservation updateReservation(ReservationUpdateRequeset requeset);
}
