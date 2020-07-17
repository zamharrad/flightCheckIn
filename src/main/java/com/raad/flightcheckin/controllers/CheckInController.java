package com.raad.flightcheckin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckInController {

    @RequestMapping("/showStartCheckin")
    public String showStartChecking() {
        return "startCheckIn";
    }
}
