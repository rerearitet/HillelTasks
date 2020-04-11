package com.antongorokh.CatData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatData {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] arr;
            arr = sc.nextLine().split(", ");
        while(!arr[0].equals("")) {
            try {
                cats.add(new Cat(arr[0], Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3])));
            } catch (Exception e) { }
            arr = sc.nextLine().split(", ");
        }

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).toString());
        }
    }
}
