package com.antongorokh.lesson2task2;

public class Dog {
    private String name;
    private int age;
    private int weight;

    private Dog() {

    }

    @Override
    public String toString() {
        return "Dog: \n name: " + (name != null ? name : "unknown") + "\n age: " + age + "\n weight: " + weight + "\n" + super.toString();
    }

    //setters and getters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return  weight;
    }

    //constructors

    public Dog(String name) {
        setName(name);
        //our initialize
        setAge(1);
        setWeight(1);
    }

    public Dog(String name, int age) {
        setName(name);
        setAge(age);
        //our initialize
        setWeight(1);
    }

    public Dog(String name, int age, int weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public Dog(int age, int weight) {
        setAge(age);
        setWeight(weight);
        //our initialize
    }
}
