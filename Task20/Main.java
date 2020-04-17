package task20;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(0, 1);
        myList.add(0, 2);
        myList.add(0, 3);
        myList.add(0, 4);
        myList.add(0, 5);
        System.out.println(myList.toString());
        System.out.println(myList.get(3));
        myList.add(3, 6);
        System.out.println(myList.toString());
        myList.set(1, 7);
        System.out.println(myList.toString());
        myList.remove(2);
        System.out.println(myList.toString());

        System.out.println("--------------------------------");

        MyIntegerLinkedList myIntegerLinkedList = new MyIntegerLinkedList();
        myIntegerLinkedList.add(0, 1);
        myIntegerLinkedList.add(0, 2);
        myIntegerLinkedList.add(0, 3);
        myIntegerLinkedList.add(0, 4);
        myIntegerLinkedList.add(0, 5);
        System.out.println(myIntegerLinkedList.toString());
        System.out.println(myIntegerLinkedList.get(3));
        myIntegerLinkedList.add(3, 6);
        System.out.println(myIntegerLinkedList.toString());
        myIntegerLinkedList.set(1, 7);
        System.out.println(myIntegerLinkedList.toString());
        myIntegerLinkedList.remove(2);
        System.out.println(myIntegerLinkedList.toString());
    }
}
