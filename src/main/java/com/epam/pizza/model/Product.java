package com.epam.pizza.model;

public abstract class Product {
    String productName;
    int Value;

    public String getProductName() {
        return productName;
    }

    public int getValue() {
        return Value;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setValue(int value) {
        Value = value;
    }
}
