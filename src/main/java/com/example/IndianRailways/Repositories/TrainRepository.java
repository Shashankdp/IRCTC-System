package com.example.IndianRailways.Repositories;

import com.example.IndianRailways.Models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer> {

}
