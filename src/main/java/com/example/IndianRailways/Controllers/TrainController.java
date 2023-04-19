package com.example.IndianRailways.Controllers;

import com.example.IndianRailways.Models.Train;
import com.example.IndianRailways.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    TrainService trainService;

    @PostMapping("/add")
    public String addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }
}
