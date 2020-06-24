package com.epam.pizza.model;

public enum Ingredients {
    CHICKEN("Курица"),
    HAM("Ветчина"),
    PEPPERONI("Пеперони"),
    TOMATO_SAUCE("Томатный соус"),
    CHORIZA("Охотьничьи колбаски"),
    MOZZARELLA("Моцарелла"),
    LARGE_PORTION_OF_MOZZARELLA("Много моцареллы"),
    MIX_OF_CHEDDAR_AND_PARMESAN("Микс чеддар и пармезан"),
    BLUE_CHEESE("Дор Блю"),
    CREAM_SAUCE("Сметана"),
    CHAMPIGNONS("Шампиньоны"),
    GARLIC("Чеснок"),
    COTTAGE_CHEESE("Мягкий сыр");

    private String name;

    Ingredients(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
