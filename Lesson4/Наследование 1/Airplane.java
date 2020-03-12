package com.antongorokh.lesson4;

public class Airplane extends Transport {
    int maxHeight;

    public Airplane(String releaseDate, String model, int passengerCapacity, int maxSpeed) {
        super(releaseDate, model, passengerCapacity);
        this.maxHeight = maxSpeed;
    }

    public void autopilotMove() {
        System.out.println("Flying with auto pilot...");
    }
    @Override
    public void move() {
        System.out.println("Flying...");
    }
}
