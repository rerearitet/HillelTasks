package com.antongorokh.MyStringArrayList;

public class MyStringArrayList {
    String[] array;
    int defaultCapacity;

    public MyStringArrayList () {
        array = new String[defaultCapacity];
    }

    public String get(int index) {
        try {
            return array[index];
        } catch (Exception e) { }
        return null;
    }

    public void set(int index, String element) {
        try {
        array[index] = element;
        } catch (Exception e) { }
    }

    public void remove(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        String[] tempArray = array.clone();
        array = new String[tempArray.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
    }
    public void add(int index, String element) {
        if (index > array.length) index = array.length;
        String[] tempArray = array.clone();
        array = new String[tempArray.length + 1];
        for(int i = 0; i < index; i++) {
            array[i] = tempArray[i];
        }
        array[index] = element;
        for (int i = index + 1; i < array.length; i++) {
            array[i] = tempArray[i - 1];
        }
    }

    public String toString() {
        String toString = "[ ";
        for (int i = 0; i < array.length - 1; i++) {
            toString += array[i] + ", ";
        }
        return toString + array[array.length - 1] + " ]";
    }
}
