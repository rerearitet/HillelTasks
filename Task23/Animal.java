package com.antongorokh.task23;

import java.util.HashSet;
import java.util.Set;

public class Animal {
    public static class Dog extends Animal {
    }
    public static class Cat extends Animal {
    }
    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }
    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }
    public static Set<Animal> join (Set<Cat> cats, Set<Dog> dogs) {
        Set<Animal> pets = new HashSet<>(cats);
        pets.addAll(dogs);
        return pets;
    }
    public static Set<Animal> removeCats (Set<Animal> pets) {
        Set<Animal> delPets = new HashSet<>();
        for (Animal animal : pets) {
            if (animal instanceof Cat) delPets.add(animal);
        }
        pets.removeAll(delPets);
        return pets;
    }

    public static void printPets(Set<Animal> pets) {
        for (Animal animal : pets) System.out.println(animal.toString());
    }
    public String toString() {
        return getClass().getSimpleName();
    }
}
