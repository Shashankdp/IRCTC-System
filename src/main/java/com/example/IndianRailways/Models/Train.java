package com.example.IndianRailways.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Trains")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tarinNo;
    private String source;
    private String destination;

    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
    private List<Passenger> listOfPassengers=new ArrayList<>();

    public List<Passenger> getListOfPassengers() {
        return listOfPassengers;
    }

    public void setListOfPassengers(List<Passenger> listOfPassengers) {
        this.listOfPassengers = listOfPassengers;
    }

    public Train() {
    }

    public Train(int tarinNo, String source, String destination) {
        this.tarinNo = tarinNo;
        this.source = source;
        this.destination = destination;
    }

    public Train(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public int getTarinNo() {
        return tarinNo;
    }

    public void setTarinNo(int tarinNo) {
        this.tarinNo = tarinNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
