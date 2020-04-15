package com.antongorokh.map;

/*Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
«фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом. */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Date> hashMap = new HashMap<String, Date>();
        hashMap.put("Smirnov", new Date(1970, 1, 1));
        hashMap.put("Ivanov", new Date(1970, 2, 1));
        hashMap.put("Kyznecov", new Date(1970, 3, 1));
        hashMap.put("Sokolov", new Date(1970, 4, 1));
        hashMap.put("Popov", new Date(1970, 5, 1));
        hashMap.put("Lebedev", new Date(1970, 6, 1));
        hashMap.put("Kozlov", new Date(1970, 7, 1));
        hashMap.put("Novikov", new Date(1970, 8, 1));
        hashMap.put("Morozov", new Date(1970, 9, 1));
        hashMap.put("Petrov", new Date(1970, 10, 1));

        hashMap.entrySet().removeIf(e -> e.getValue().getMonth() >= 6 && e.getValue().getMonth() <= 8);

        for (Map.Entry<String, Date> entry : hashMap.entrySet()) {
            System.out.println("Surname: " + entry.getKey() + ", Month: " + entry.getValue().getMonth());
        }
    }
}
