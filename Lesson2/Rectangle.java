package com.antongorokh.lesson2task2;

import java.lang.reflect.Field;

public class Rectangle {
    public int width, height, top, left;
    private Field[] classFields = Rectangle.class.getFields();

    private Rectangle() {

    }

    public Rectangle(Rectangle rectangle) { //wanted it to work for every count of fields :)
        Field[] constructorClassFields = rectangle.getClass().getFields();
        for (int i = 0; i < classFields.length; i++) {
            for (int j = 0; j < constructorClassFields.length; i++) {
                if (classFields[i].getName().equals(constructorClassFields[j].getName())) {
                    try {
                        classFields[i].set(this, constructorClassFields[j].get(rectangle));
                    } catch (IllegalAccessException e) {

                    }
                }
            }
        }
    }

    public Rectangle(int width, int height, int top, int left) {
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public Rectangle(int width, int height, int top) {
        this.width = width;
        this.height = height;
        this.top = top;
    }

    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.height = this.width = 0;
    }

    public Rectangle(int width) {
        this.height = this.width = width;
    }
}
