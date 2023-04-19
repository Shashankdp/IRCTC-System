package com.example.IndianRailways.Services;

import com.example.IndianRailways.Models.Train;
import com.example.IndianRailways.Repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    @Autowired
    TrainRepository trainRepository;

    public String addTrain(Train train){
        trainRepository.save(train);
        return "train is ready to go";
    }
}
