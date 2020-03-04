package com.antongorokh.lesson2task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static class ConsoleReader {
        static Scanner sc = new Scanner(System.in);

        public static String readString() {
            return sc.nextLine();
        }

        public static int readInt() {
            return sc.nextInt();
        }

        public static double readDouble() {
            return sc.nextDouble();
        }

        public static void readLn() {
            sc.nextLine();
        }
    }
}

