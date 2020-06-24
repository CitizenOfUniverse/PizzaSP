package com.epam.pizza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.epam.pizza.model.*;

@RestController
public class OrderController {

    private static final String HELLO_WORLD = "Test";

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return HELLO_WORLD;
    }

    @GetMapping("/GetProducts")
    public List getProducts() {
        return null;
    }

    @PostMapping("/CreateOrder")
    public boolean createOrder() {
        return true;
    }

    @GetMapping("/tryProducts")
    public Product tryProducts(){
        Product pr = new Pizza(new String("Мясная"), 2);
        return pr;
    }

}
