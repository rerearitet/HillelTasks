package com.company.lesson1;

public class Task1 {
    public static void main(String[] args) {
        try {
            recursionFunc(1, Integer.parseInt(args[0]));
        } catch (Exception e) {

        }
    }

    public static void recursionFunc(int number, int goalNumber) {
        System.out.println(number);
        if (number < goalNumber) recursionFunc(++number, goalNumber);
    }
}
