package com.company.lesson1;

public class Task1 {
    public static void main(String[] args) {
        recursionFunc(1, 100);
    }

    public static void recursionFunc(int number, int goalNumber) {
        System.out.println(number);
        if (number < goalNumber) recursionFunc(++number, goalNumber);
    }
}
