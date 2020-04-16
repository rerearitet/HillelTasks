package com.antongorokh.task14;

public class Cat extends Animal implements Run, Climb {
    public void run() {
        System.out.println("run");
    }
    public void climb() {
        System.out.println("climb");
    }
}
