package com.antongorokh.interfaces;

public class Duck implements Runnable, Swimable, Flyable {
    public void run() {
        System.out.println("RUN");
    }
    public void swim() {
        System.out.println("SWIM");
    }
    public void fly() {
        System.out.println("FLY");
    }
}
