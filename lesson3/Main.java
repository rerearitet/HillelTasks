package com.antongorokh.lesson2task2;

import com.antongorokh.lesson2task2.Cat;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Util.getDistance(1, 2, 5, 13));
    }

    public static class Util {
        public static double getDistance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //according to site bitly.su/6Scs
        }
    }
}

