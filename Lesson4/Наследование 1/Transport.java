package com.antongorokh.lesson4;

public class Transport {
    String releaseDate;
    String model;
    int passengerCapacity;

    public Transport(String releaseDate, String model, int passengerCapacity) {
        this.releaseDate = releaseDate;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
    }

    public void move() {
        System.out.println("Moving...");
    }
}
