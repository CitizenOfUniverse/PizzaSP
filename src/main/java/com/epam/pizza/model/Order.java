package com.epam.pizza.model;

public class Order {
    enum PayMethod{CreditCard, Cash}
    Product[] product;
    String name;
    String phoneNumber;
    String address;
    PayMethod payMethod;
    
    public void setProduct(Product[] product) {
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

    public Product[] getProduct() {
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

}
