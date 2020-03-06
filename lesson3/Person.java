package com.antongorokh.lesson2task2;

public class Person {
    static String name;
    static Account ACCOUNT;

    public static void main(String[] args) {
        name = "Boomer";
        ACCOUNT = new Account("SuperPyperNagibatorLbv99");
        ACCOUNT.displayAccount();
    }

    static class Account {
        String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            if (name != null && password != null) System.out.println("Person: " + name + ", " + name + "'s password is: " + password);
        }
    }
}
