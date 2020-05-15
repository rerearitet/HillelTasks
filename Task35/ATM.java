package task35;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ATM { /* <currency> <value> <number> | USD 100 30, ArrayList<Pair<currency, Pair<value, number>>>, Attempt: 3 */

    private ArrayList<Pair<String, Pair<Integer, Integer>>> atm = new ArrayList<>();
    private String regex;

    private ATM() { }

    public ATM(String regex) {
        this.regex = regex;
    }

    public void input(String input) {
        String[] split = input.split(regex);
        try {
            if (split[0].equals("+")) {
                addCurrency(Arrays.copyOfRange(split, 1, split.length)); // copy array without 1st element("+" here).
            } else if (split[0].equals("-")) {
                removeCurrency(Arrays.copyOfRange(split, 1, split.length)); // copy array without 1st element("-" here).
            } else if (split[0].equals("?")) {
                sortByCurrency();
                for (int i = 0; i < atm.size(); i++) printElement(atm.get(i));
            } else {
                System.out.println("Unknown command. ");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR. ");
        }catch (Exception e) {
            System.out.println("Oops, something went wrong, maybe you entered invalid data. ");
        }
    }

    private void removeCurrency(String[] input) throws NumberFormatException, IndexOutOfBoundsException {
        if (Integer.valueOf(input[1]) <= 0) {
            System.out.println("Invalid amount. ");
            return;
        }
        if (input[0].length() != 3 || !input[0].equals(input[0].toUpperCase())) {
            System.out.println("Invalid currency. ");
            return;
        }
        // input[0] - <currency>, input[1] - <amount>.
        int amount = Integer.valueOf(input[1]);
        ArrayList<Pair<Integer, Integer>> currency = new ArrayList<>();
        ArrayList<String> printTasks = new ArrayList<>();
        if (getCurrencyAmount(input[0]) < amount) {
            System.out.println("Not enough money. ");
            return;
        }
        sortByCurrency();
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getKey().equals(input[0])) {
                currency.add(atm.get(i).getValue());
            }
        }
        for (int i = 0; i < currency.size(); i++) {
            int startNumber = currency.get(i).getValue();
            while ((amount - currency.get(i).getKey()) >= 0 && currency.get(i).getValue() > 0) {
                amount -= currency.get(i).getKey();
                currency.set(i, new Pair<>(currency.get(i).getKey(), currency.get(i).getValue() - 1));
            }
            if (startNumber - currency.get(i).getValue() > 0) printTasks.add(currency.get(i).getKey() + regex + (startNumber - currency.get(i).getValue()));
        }
        if (amount != 0) {
            System.out.println("ERROR.");
            return;
        }
        else {
            for (int i = 0; i < atm.size(); i++) {
                for (int j = 0; j < currency.size(); j++) {
                    if (atm.get(i).getKey().equals(input[0]) && atm.get(i).getValue().getKey().equals(currency.get(j).getKey())) {
                        atm.set(i, new Pair<String, Pair<Integer, Integer>>(atm.get(i).getKey(), new Pair(currency.get(j).getKey(), currency.get(j).getValue())));
                    }
                }
            }
            for (int i = 0; i < printTasks.size(); i++) {
                System.out.println(printTasks.get(i));
            }
        }
    }

    private int getCurrencyAmount(String currency) {
        int amount = 0;
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getKey().equals(currency)) {
                amount += atm.get(i).getValue().getKey() * atm.get(i).getValue().getValue();
            }
        }
        return amount;
    }

    private void addCurrency(String[] input) throws NumberFormatException, IndexOutOfBoundsException {
        if (!isAddValid(input)) return;
        /* input[0] - <currency>, input[1] - <value>, input[2] - <number>.
           if currency and value already exists */
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getKey().equals(input[0]) && atm.get(i).getValue().getKey() == Integer.valueOf(input[1])) {
                atm.set(i, new Pair<>(atm.get(i).getKey(), new Pair<>(atm.get(i).getValue().getKey(), atm.get(i).getValue().getValue() + Integer.valueOf(input[2])))); //sorry for that :/
                System.out.println("OK");
                return;
            }
        }
        // otherwise
        atm.add(new Pair<>(input[0], new Pair<>(Integer.valueOf(input[1]), Integer.valueOf(input[2]))));
        System.out.println("OK");
    }

    private boolean isAddValid(String[] input) {
        /* input[0] - <currency>, input[1] - <value>, input[2] - <number>. */
        if (input[0].length() != 3 || !input[0].equals(input[0].toUpperCase())) {
            System.out.println("Invalid currency. ");
            return false;
        }
        if (Integer.valueOf(input[2]) <= 0) {
            System.out.println("Invalid number. ");
            return false;
        }
        for (int i = 0; i <= 3; i++) {
            if (Integer.valueOf(input[1]) == Math.pow(10, i) || Integer.valueOf(input[1]) == 5 * Math.pow(10, i)) {
                return true;
            }
        }
        System.out.println("Invalid value. ");
        return false;
    }

    private void sortByCurrency() {
        // P.S: comparator stopped me for almost a day ;/
        Collections.sort(atm, new Comparator<>() {
            @Override
            public int compare(Pair<String, Pair<Integer, Integer>> p1, Pair<String, Pair<Integer, Integer>> p2) {
                return comparePair(p1, p2);
            }

            private int comparePair(Pair<String, Pair<Integer, Integer>> p1, Pair<String, Pair<Integer, Integer>> p2) {
                if (p1.getKey().equals(p2.getKey())) { //if the same currency compare by value
                    return p2.getValue().getKey().compareTo(p1.getValue().getKey());
                } else { // otherwise compare by currency
                    return p1.getKey().compareTo(p2.getKey());
                }
            }
        });
    }

    private void printElement(Pair<String, Pair<Integer, Integer>> pair) {
        System.out.println(pair.getKey() + regex + pair.getValue().getKey() + regex + pair.getValue().getValue());
    }
}