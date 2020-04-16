package com.antongorokh.task14;

public class Duck extends Animal implements Run, Fly {
    public void run() {
        System.out.println("run");
    }
    public void fly() {
        System.out.println("fly");
    }
}
