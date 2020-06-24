package com.epam.pizza.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pizza extends Product {
    private String pizzaType;
    private String nutritionalValue;
    private int ccal;

    @ElementCollection(targetClass = Ingredients.class)
    @CollectionTable(name = "ingredients",
            joinColumns = @JoinColumn(name = "pizza_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "ingredients")
    private List<Ingredients> ingredients;

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(String nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    public int getCcal() {
        return ccal;
    }

    public void setCcal(int ccal) {
        this.ccal = ccal;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
