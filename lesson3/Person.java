package com.antongorokh.lesson2task2;

public class Person {
    String name;
    Account account;

    public class Account {
        String password;

        private Account() { //coz who needs account without password?
        }

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            if (name == null) {
                System.out.println("Person's name: unknown, person's password: \"" + password + "\".");
            } else {
                System.out.println("Person's name: " + name + ", " + name + "'s password: \"" + password + "\".");
            }
        }
    }
}
