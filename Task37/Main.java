package com.hillel.lombok.task37;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, OrderStatus> orders = new HashMap<>();
        orders.put("1337", OrderStatus.NEW);
        while(true) {
            try {
                System.out.println("Type order: ");
                String order = sc.nextLine();
                if (order.equals("")) break;
                if (!orders.containsKey(order)) orders.put(order, OrderStatus.NEW);
                else {
                    System.out.println("Type status: ");
                    OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine().toUpperCase());
                    if (orders.get(order).ordinal() >= orderStatus.ordinal()) {
                        throw new IllegalArgumentException();
                    } else {
                        orders.put(order, orderStatus);
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid input, please try again: ");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid status, please try again: ");
            } catch (Exception e) {
                System.out.println("Oops, something went wrong, please try again: ");
            }
        }
        for (Map.Entry<String, OrderStatus> entry : orders.entrySet()) System.out.println(entry.getKey() + " " + entry.getValue());
    }

    public enum OrderStatus {
        NEW,
        IN_PROGRESS,
        DONE,
        ERROR
    }
}
