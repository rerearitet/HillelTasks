package com.antongorokh.task24;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputStream inputStream;
        while (true) {
            try {
                inputStream = new FileInputStream(new File(sc.nextLine()));
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
            } catch (Exception e) {
                e.getMessage();
            }
        }

        try {
            OutputStream outputStream = new FileOutputStream(new File(sc.nextLine()));
            while (inputStream.available() > 0) {
                outputStream.write(inputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
