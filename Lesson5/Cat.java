package com.antongorokh.zoo;

public class Cat extends Animal implements Run, Climb {
    public void run() {
        System.out.print("run ");
    }

    public void climb() {
        System.out.print("climb ");
    }

    public void completeClassMethods() {
        run();
        climb();
    }
}
