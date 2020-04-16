package com.antongorokh.task25;

/*Пользователь вводит с клавиатуры список слов (и чисел).
 Слова вывести в возрастающем порядке, числа - в убывающем.*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> soutOrder = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            if (input.equals("")) break;
            try {
                numbers.add(Integer.valueOf(input));
                soutOrder.add("numbers");
            } catch (NumberFormatException e) {
                words.add(input);
                soutOrder.add("words");
            }
        }
        Collections.sort(words);
        Collections.sort(numbers);
        Collections.reverse(numbers);

        int wordsOrder = 0, numbersOrder = 0;

        for (int i = 0; i < soutOrder.size(); i++) {
            if (soutOrder.get(i).equals("words")) {
                System.out.println(words.get(wordsOrder));
                wordsOrder++;
            } else if (soutOrder.get(i).equals("numbers")) {
                System.out.println(numbers.get(numbersOrder));
                numbersOrder++;
            }
        }
    }
}
