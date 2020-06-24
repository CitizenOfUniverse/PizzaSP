package com.epam.pizza.model;

import java.util.List;

public class Order {
    enum PayMethod{CreditCard, Cash}
    List<Product> product;
    String name;
    String phoneNumber;
    String address;
    PayMethod payMethod;

    public Order(List<Product> product) {
        this.product = product;
    }

    Order(){
        // this.product = new List<Product>();
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public List<Product> getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }
    public boolean isQuantityCorrect(){
        int pizzaNum = 0;
        int drinksNum = 0;
        //TODO: checking
        return pizzaNum <= 5 & drinksNum <= 5;
    }
}
