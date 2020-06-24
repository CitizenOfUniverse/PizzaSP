package com.epam.pizza.model;

public class Pizza extends Product {
    enum Ingredients{Chicken, Ham, Pepperoni}
    Ingredients[] composition;
    String pizzaType;
    String nutritionalValue;
    int ccal;

    /*public Pizza(String productName, int value, String pizzaType) {
        super(productName, value);
        this.pizzaType = pizzaType;
    }*/

    public Pizza(String productName, int value) {
        super(productName, value);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Ingredients[] getComposition() {
        return composition;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public int getCcal() {
        return ccal;
    }

    public void setComposition(Ingredients[] composition) {
        this.composition = composition;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setNutritionalValue(String nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    public void setCcal(int ccal) {
        this.ccal = ccal;
    }
}
