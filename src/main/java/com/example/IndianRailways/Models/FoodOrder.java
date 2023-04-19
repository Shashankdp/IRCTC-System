package com.example.IndianRailways.Models;

import jdk.jfr.DataAmount;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int ticketId;
    private int trainId;
    private int price;

    public FoodOrder() {
    }

    public FoodOrder(int ticketId, int trainId, int price) {
        this.ticketId = ticketId;
        this.trainId = trainId;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
