package com.antongorokh.task22;

/*Пользователь вводит последовательно название города, фамилию семьи.
 Пока пользователь не ввел пустой город или фамилию.
  Затем пользователь вводит имя города и получает фамилию семьи. Использовать Map */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String city = sc.nextLine();
            if (city.equals("")) break;
            String familyName = sc.nextLine();
            if (familyName.equals("")) break;
            hashMap.put(city, familyName);
        }
        System.out.println(hashMap.get(sc.nextLine()));
    }
}
