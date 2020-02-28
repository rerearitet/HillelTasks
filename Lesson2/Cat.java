package com.antongorokh.lesson2task2;

public class Cat {
    String name, color, address;
    int weight, age;

    private Cat() {

    }

    public Cat(String name) {
        //constructor initialize
        this.name = name;
        //our initialize
        age = 1;
        weight = 1;
    }

    public Cat(String name, int weight, int age) {
        //constructor initialize
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        //constructor initialize
        this.name = name;
        this.age = age;
        //our initialize
        weight = 1;
    }

    public Cat(int weight, String color) {
        //constructor initialize
        this.weight = weight;
        this.color = color;
        //our initialize
        age = 1;
    }

    public Cat(int weight, String color, String address) {
        //constructor initialize
        this.weight = weight;
        this.color = color;
        this.address = address;
        //our initialize
        age = 1;
    }

    @Override
    public String toString() {
        return "Cat: \n name: " + (name != null ? name : "unknown") + "\n age: " + age + "\n weight: " + weight + "\n color: " + (color != null ? color : "unknown") + "\n address: " + (address != null ? address : "unknown") + "\n" + super.toString();
    }
}
