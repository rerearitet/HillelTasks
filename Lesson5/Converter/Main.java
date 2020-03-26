package com.antongorokh.converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int degrees;
        char system;
        Scanner sc = new Scanner(System.in);
        System.out.println("Degree system(F or K):");
        system = sc.nextLine().charAt(0);
        System.out.println("Degrees(celsius):");
        degrees = sc.nextInt();

        if (system == 70) System.out.println((double) Math.round((new FahrenheitConverter().convert(degrees)) * 1000) / 1000); //also rounded
        else if (system == 75) System.out.println((double) Math.round((new KelvinConverter().convert(degrees)) * 1000) / 1000);
        else System.out.println("Uncorrect input.");
    }
}
