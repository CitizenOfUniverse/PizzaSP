package com.epam.pizza.model;

import javax.persistence.Entity;

@Entity
public class Drink extends Product {

    private float volume;

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
