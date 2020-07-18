package com.raad.flightcheckin.controllers;

import com.raad.flightcheckin.dto.Reservation;
import com.raad.flightcheckin.dto.ReservationUpdateRequeset;
import com.raad.flightcheckin.integration.ReservationRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckInController {

    @Autowired
    ReservationRestClient reservationRestClient;

    @RequestMapping("/showStartCheckin")
    public String showStartChecking() {
        return "startCheckIn";
    }

    @RequestMapping("/startCheckIn")
    public String startCheckIn(@RequestParam("reservationId") Long id, ModelMap modelMap) {
        Reservation reservation = reservationRestClient.findReservation(id);
        modelMap.addAttribute("reservation", reservation);
        return "displayReservationDetails";
    }

    @RequestMapping("/completeCheckIn")
    public String completCheckIn(@RequestParam("reservationId") Long reservationId, @RequestParam("numberOfBags") int numberOfBags) {
        ReservationUpdateRequeset reservationUpdateRequeset = new ReservationUpdateRequeset();
        reservationUpdateRequeset.setCheckedIn(true);
        reservationUpdateRequeset.setId(reservationId);
        reservationUpdateRequeset.setNumberOfBags(numberOfBags);
        reservationRestClient.updateReservation(reservationUpdateRequeset);

        return "checkConfirmation";
    }
}
