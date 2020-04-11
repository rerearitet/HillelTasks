package com.antongorokh.inputOutputStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserAccounting user = new UserAccounting("E:/user.txt");
        user.readUser();
        System.out.println(user.toString());

        user.writeUser("Petrenko Petrov Petrovi4", 24, "male", "Kiev");
        System.out.println(user.toString());

        user.writeUser("Boom", 21, "female", "Odessa");
    }
}
