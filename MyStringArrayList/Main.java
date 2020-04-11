package com.antongorokh.MyStringArrayList;

public class Main {
    public static void main(String[] args) {
        MyStringArrayList myStringArrayList = new MyStringArrayList();
        myStringArrayList.add(0, "1");
        myStringArrayList.add(0, "2");
        myStringArrayList.add(0, "3");
        myStringArrayList.add(5, "4");
        System.out.println(myStringArrayList.toString());

        myStringArrayList.remove(2);
        System.out.println(myStringArrayList.toString());

        myStringArrayList.set(1, "22");
        System.out.println(myStringArrayList.toString());

        System.out.println(myStringArrayList.get(2));
    }
}