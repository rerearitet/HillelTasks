package com.antongorokh.lesson4;

public class Train extends Transport {
    int maxSpeed;

    public Train(String releaseDate, String model, int passengerCapacity, int maxSpeed) {
        super(releaseDate, model, passengerCapacity);
        this.maxSpeed = maxSpeed;
    }

    public void beep() {
        System.out.println("BEEP");
    }
    @Override
    public void move() {
        System.out.println("Riding on rails...");
    }
}
