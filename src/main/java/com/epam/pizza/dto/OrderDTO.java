package com.epam.pizza.dto;

import com.epam.pizza.model.PayMethod;

import java.util.UUID;

public class OrderDTO {

    private Iterable<UUID> productId;
    private String name;
    private String phoneNumber;
    private String address;
    private PayMethod payMethod;

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

    public Iterable<UUID> getProductId() {
        return productId;
    }

    public void setProductId(Iterable<UUID> productId) {
        this.productId = productId;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }
}
