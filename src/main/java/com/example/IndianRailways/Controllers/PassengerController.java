package com.example.IndianRailways.Controllers;

import com.example.IndianRailways.Models.Passenger;
import com.example.IndianRailways.Services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @PostMapping("/add")
    public String addPassenger(@RequestBody Passenger passenger){
        return passengerService.addPassenger(passenger);
    }
}
