package com.antongorokh.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        boolean isFinished = false;
        while (!isFinished) {
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
                    completeMethods(animals);
                    break;
                default:
                    System.out.println("Unexpected input.");
            }
        }
    }

    public static void completeMethods(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            System.out.print("\n" + animal.getClass().getSimpleName() + ": ");
            animal.completeClassMethods(); //i could use reflection, but it's too much for such a simple program :)
        }
    }
}
