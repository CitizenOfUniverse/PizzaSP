package com.epam.pizza.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TOrder")
public class Order {

    @Id
    private UUID id;
    @ManyToMany
    private List<Product> products;
    private String name;
    private String phoneNumber;
    private String address;
    @Transient
    private int amountOfPizza;
    @Transient
    private int amountOfDrink;
    @Enumerated(EnumType.STRING)
    private PayMethod payMethod;

    public Order() {
        this.products = new ArrayList<>();
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountOfPizza() {
        return amountOfPizza;
    }

    public void setAmountOfPizza(int amountOfPizza) {
        this.amountOfPizza = amountOfPizza;
    }

    public int getAmountOfDrink() {
        return amountOfDrink;
    }

    public void setAmountOfDrink(int amountOfDrink) {
        this.amountOfDrink = amountOfDrink;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }
}
