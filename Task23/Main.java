package com.antongorokh.task23;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Animal> pets1 = Animal.join(Animal.createCats(), Animal.createDogs());
        Animal.printPets(pets1);
        System.out.println("---");
        Set<Animal> pets2 = Animal.removeCats(Animal.join(Animal.createCats(), Animal.createDogs()));
        Animal.printPets(pets2);
    }
}
