package com.example.IndianRailways.Models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "Passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;
    private int trainId;
    @CreationTimestamp
    private Date date;

    private int age;
    private String gender;

    @ManyToOne
    @JoinColumn
    private Train train;

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger() {
    }

    public Passenger(int ticketId, int trainId, Date date, int age, String gender) {
        this.ticketId = ticketId;
        this.trainId = trainId;
        this.date = date;
        this.age = age;
        this.gender = gender;
    }

    public Passenger(int trainId, Date date, int age, String gender) {
        this.trainId = trainId;
        this.date = date;
        this.age = age;
        this.gender = gender;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
