package com.epam.pizza.model;

public class Drink extends Product {
    int size;

    public Drink(String productName, int value) {
        super(productName, value);
    }

    public Drink(String productName, int value, int size) {
        super(productName, value);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
