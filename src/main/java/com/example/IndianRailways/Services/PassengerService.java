package com.example.IndianRailways.Services;

import com.example.IndianRailways.Models.Passenger;
import com.example.IndianRailways.Models.Train;
import com.example.IndianRailways.Repositories.PassengerRepository;
import com.example.IndianRailways.Repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    TrainRepository trainRepository;

    public String addPassenger(Passenger passenger){

        Train train=trainRepository.findById(passenger.getTrainId()).get();
        passenger.setTrain(train);
        List<Passenger> passengerList=train.getListOfPassengers();
        passengerList.add(passenger);

        trainRepository.save(train);

        return "passenger added successfully";

    }
}
