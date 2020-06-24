package com.epam.pizza.model;

public abstract class Product {
    String productName;
    int value;

    public Product(String productName, int value) {
        this.productName = productName;
        this.value = value;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getProductName() {
        return productName;
    }

    public int getValue() {
        return value;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
