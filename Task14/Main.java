package com.antongorokh.task14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        boolean isFinished = false;
        while(!isFinished) {
            switch (sc.nextLine()) {
                case "Cat":
                    animals.add(new Cat());
                    break;
                case "Dog":
                    animals.add(new Dog());
                    break;
                case "Tiger":
                    animals.add(new Tiger());
                    break;
                case "Duck":
                    animals.add(new Duck());
                    break;
                case "":
                    isFinished = true;
                    break;
                default:
                    System.out.println("Unexpected input.");
                    break;
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getClass().getSimpleName() + ": ");
            completeAnimalMethods(animals.get(i));
        }
    }
    public static void completeAnimalMethods(Animal animal) {
        if (animal instanceof Fly) ((Fly) animal).fly();
        if (animal instanceof Run) ((Run) animal).run();
        if (animal instanceof Climb) ((Climb) animal).climb();
    }
}
