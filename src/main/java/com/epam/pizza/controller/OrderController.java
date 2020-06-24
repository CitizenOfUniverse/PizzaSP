package com.epam.pizza.controller;

import com.epam.pizza.dto.OrderDTO;
import com.epam.pizza.model.*;
import com.epam.pizza.repository.OrderRepository;
import com.epam.pizza.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class OrderController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/GetProducts")
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/GetOrders")
    public Iterable<Order> getOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/GetOrder")
    public Optional<Order> findOrderById(@RequestParam("id") UUID id) {
        return orderRepository.findById(id);
    }

    @PostMapping("/CreateOrder")
    public boolean createOrder(@RequestBody Order order) {
        orderRepository.save(order);
        return true;
    }

    @PostMapping("/CreateOrderDto")
    public boolean createOrderDto(@RequestBody OrderDTO orderDto) {
        Order order = new Order();

        order.setId(UUID.randomUUID());
        productRepository
                .findAllById(orderDto.getProductId())
                .iterator()
                .forEachRemaining(order.getProducts()::add);

        order.setPhoneNumber(orderDto.getPhoneNumber());
        order.setName(orderDto.getName());
        order.setAddress(orderDto.getAddress());
        order.setPayMethod(orderDto.getPayMethod());

        orderRepository.save(order);
        return true;
    }

    @GetMapping("/init")
    public boolean init() {
        List<Product> menu = new ArrayList<>();

        Pizza pizza = new Pizza();
        pizza.setId(UUID.randomUUID());
        pizza.setCcal(450);
        pizza.setNutritionalValue("Б: 123, Ж: 150, У: 480");
        pizza.setPizzaType("Большая");
        pizza.setProductName("Мексиканская");
        pizza.setIngredients(Arrays.asList(Ingredients.CHORIZA, Ingredients.MOZZARELLA, Ingredients.CHICKEN, Ingredients.GARLIC));
        pizza.setPrice(628);
        menu.add(pizza);

        pizza = new Pizza();
        pizza.setId(UUID.randomUUID());
        pizza.setCcal(600);
        pizza.setNutritionalValue("Б: 456, Ж: 700, У: 900");
        pizza.setPizzaType("Большая");
        pizza.setProductName("От Шефа");
        pizza.setIngredients(Arrays.asList(Ingredients.CHORIZA, Ingredients.BLUE_CHEESE, Ingredients.HAM, Ingredients.GARLIC));
        pizza.setPrice(750);
        menu.add(pizza);

        pizza = new Pizza();
        pizza.setId(UUID.randomUUID());
        pizza.setCcal(540);
        pizza.setNutritionalValue("Б: 456, Ж: 321, У: 289");
        pizza.setPizzaType("Большая");
        pizza.setProductName("Сыр сыр");
        pizza.setIngredients(Arrays.asList(Ingredients.CREAM_SAUCE, Ingredients.CHAMPIGNONS, Ingredients.CHICKEN, Ingredients.MIX_OF_CHEDDAR_AND_PARMESAN));
        pizza.setPrice(628);
        menu.add(pizza);

        Drink drink = new Drink();
        drink.setId(UUID.randomUUID());
        drink.setVolume(0.5f);
        drink.setProductName("Вятский квас");
        drink.setPrice(100);
        menu.add(drink);

        drink = new Drink();
        drink.setId(UUID.randomUUID());
        drink.setVolume(0.45f);
        drink.setProductName("Молоко Афанасий");
        drink.setPrice(200);
        menu.add(drink);

        productRepository.saveAll(menu);
        return true;
    }

}
