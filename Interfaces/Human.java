package com.antongorokh.interfaces;

public class Human implements Runnable, Swimable{
    public void run() {
        System.out.println("RUN");
    }
    public void swim() {
        System.out.println("SWIM");
    }
}
