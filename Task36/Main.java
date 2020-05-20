package com.hillel.lombok.task36;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.dat"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.dat"));

        User user = new User(16, "Anton", "Gorokh", "SuperPuperPeperLvl80");
        user.writeExternal(objectOutputStream);

        User user1 = new User();
        user1.readExternal(objectInputStream);
        System.out.println(user1);

        objectOutputStream.close();
        objectInputStream.close();
    }
}
