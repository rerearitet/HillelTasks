package com.hillel.lombok;

import javafx.util.Pair;

import java.util.*;
import java.util.function.Predicate;

public class ATM {

    public String regex;
    private ArrayList<String> atm = new ArrayList<>();

    private ATM() {
    }

    public ATM(String regex) {
        this.regex = regex;
    }

    public String input(String input) {
        String[] split = input.split(regex);
        try {
            switch (split[0]) {
                case "+":
                    return replenish(Arrays.copyOfRange(split, 1, split.length));
                case "-":
                    return withdraw(Arrays.copyOfRange(split, 1, split.length));
                case "?":
                    if (atm.size() == 0) return "ATM is empty. ";
                    else {
                        String result = "";
                        sortATM();
                        for (int i = 0; i < atm.size(); i++) result += atm.get(i) + "\n";
                        return result;
                    }
                default:
                    return "Invalid input. ";
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            return "Invalid input. ";
        } catch (Exception e) {
            return "Oops, something went wrong, please try again:";
        }
    }

    private String withdraw(String[] input) throws Exception { // input[0] - currency, input[1] - amount
        Predicate<String[]> isValid = (String[] checkInput) -> {
            if (checkInput[0].length() != 3 || !checkInput[0].equals(checkInput[0].toUpperCase())) {
                System.out.println("Invalid currency. ");
                return false;
            }
            if (Integer.valueOf(checkInput[1]) <= 0) {
                System.out.println("Invalid amount. ");
                return false;
            }
            return true;
        };
        if (!isValid.test(input)) throw new Exception();

        sortATM();
        int amount = Integer.valueOf(input[1]);
        ArrayList<Pair<String, String>> currencyAndUsedNotes = new ArrayList<>();
        for (int i = 0; i < atm.size(); i++) {
            String[] split = atm.get(i).split(regex);
            if (split[0].equals(input[0])) {
                int number = Integer.valueOf(split[2]);
                while ((amount - Integer.valueOf(split[1]) >= 0) && number > 0) {
                    amount -= Integer.valueOf(split[1]);
                    number--;
                }
                currencyAndUsedNotes.add(new Pair<>(split[0] + regex + split[1] + regex + (Integer.valueOf(split[2]) - (Integer.valueOf(split[2]) - number)), split[1] + regex + (Integer.valueOf(split[2]) - number)));
            }
        }
        for (int i = 0; i < atm.size(); i++) {
            String[] split = atm.get(i).split(regex);
            for (int j = 0; j < currencyAndUsedNotes.size(); j++) {
                String[] cSplit = currencyAndUsedNotes.get(j).getKey().split(regex);
                if (split[0].equals(cSplit[0]) && split[1].equals(cSplit[1])) {
                    atm.set(i, currencyAndUsedNotes.get(j).getKey());
                }
            }
        }
        String result = "";
        for (int i = 0; i < currencyAndUsedNotes.size(); i++) {
            result += currencyAndUsedNotes.get(i).getValue() + "\n";
        }
        return result;
    }

    private String replenish (String[] input) throws Exception { // input[0] - currency, input[1] - value, input[2] - number.
            if (input[0].length() != 3 || !input[0].equals(input[0].toUpperCase())) {
                return "Invalid currency. ";
            }
            if (Integer.valueOf(input[2]) <= 0) {
                return "Invalid number. ";
            }
            boolean isValueCorrect = false;
            for (int i = 0; i <= 3; i++) {
                if (Integer.valueOf(input[1]) == Math.pow(10, i) || Integer.valueOf(input[1]) == 5 * Math.pow(10, i)) isValueCorrect = true;
            }
            if (!isValueCorrect) return "Invalid value";

        for (int i = 0; i < atm.size(); i++) {
            String[] split = atm.get(i).split(regex);
            if (split[0].equals(input[0]) && split[1].equals(input[1])) {
                atm.set(i, split[0] + regex + split[1] + regex + (Integer.valueOf(split[2]) + Integer.valueOf(input[2])));
                return "OK";
            }
        }
        atm.add(input[0] + regex + input[1] + regex + input[2]);
        return "OK";
    }

    private void sortATM () {
        Collections.sort(atm, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return compareATM(s1, s2);
            }

            private int compareATM(String s1, String s2) {
                String[] split1 = s1.split(regex);
                String[] split2 = s2.split(regex);
                if (split1[0].equals(split2[0])) return Integer.valueOf(split2[1]).compareTo(Integer.valueOf(split1[1]));
                else return split1[0].compareTo(split2[0]);
            }
        });
    }
}
