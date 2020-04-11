package com.antongorokh.CatData;

public class Cat {
    String name;
    String color;
    int age;
    int weight;

    public Cat(String name, int age, String color, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Color: " + color + ", Weight: " + weight;
    }
}
