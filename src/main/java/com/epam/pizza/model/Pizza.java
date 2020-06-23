package com.epam.pizza.model;

public class Pizza extends Product {
    enum Ingredients{Chicken, Ham, Pepperoni}
    Ingredients[] composition;
    String pizzaType;
    String nutritionalValue;
    int ccal;

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
