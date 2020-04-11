package com.antongorokh.inputOutputStream;

import java.io.*;

public class UserAccounting {
    private String fileName;

    String name;
    String city;
    String sex;
    int age;

    public UserAccounting(String fileName) {
        this.fileName = fileName;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Sex: " + sex + ", City: " + city;
    }

    public void readUser() {
        try {
            InputStream inputStream = new FileInputStream(new File(fileName));
            String input = "";
            while (inputStream.available() > 0) {
                input += (char)inputStream.read();
            }
            String[] array = input.split(", ");

            this.name = array[0];
            this.age = Integer.parseInt(array[1]);
            this.sex = array[2];
            this.city = array[3];

            inputStream.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void writeUser(String name, int age, String sex, String city) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File(fileName));
        String output = name + ", " + String.valueOf(age) + ", " + sex + ", " + city;
        outputStream.write(output.getBytes());
        readUser();
    }
}
