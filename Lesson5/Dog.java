package com.antongorokh.zoo;

public class Dog extends Animal implements Run {
    public void run() {
        System.out.print("run ");
    }

    public void completeClassMethods() {
        run();
    }
}
