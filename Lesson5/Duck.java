package com.antongorokh.zoo;

public class Duck extends Animal implements Run, Fly {
    public void run() {
        System.out.print("run ");
    }

    public void fly() {
        System.out.print("fly ");
    }

    public void completeClassMethods() {
        run();
        fly();
    }
}
