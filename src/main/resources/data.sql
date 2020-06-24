-- CREATE DATABASE PizzaSP;
-- USE PizzaSP;
DROP TABLE IF EXISTS user_order;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS ingredients;
DROP TABLE IF EXISTS ingredient2product;
DROP TABLE IF EXISTS order2product;

CREATE TABLE IF NOT EXISTS user_order(
    order_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    -- pay_method ENUM(CREDIT_CARD, CASH) NOT NULL,
    pay_method VARCHAR(15) NOT NULL,
    name VARCHAR(200) NOT NULL,
    phone_number VARCHAR(12) NOT NULL,
    address VARCHAR(200) NOT NULL,
    check(pay_method IN ('CREDIT_CARD, CASH'))
);

CREATE TABLE IF NOT EXISTS product(
    product_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(50) NOT NULL,
    product_value INT NOT NULL,
    pizza_type VARCHAR(50) DEFAULT NULL,
    nutritional_value VARCHAR(20) DEFAULT NULL,
    ccal INT DEFAULT NULL,
    drink_size INT DEFAULT NULL
);

CREATE TABLE ingredients(
    ingredient_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ingredient_name VARCHAR(50) NOT NULL
);

CREATE TABLE ingredient2product(
    product_id INT NOT NULL,
    ingredient_id INT NOT NULL,
    PRIMARY KEY(product_id, ingredient_id),
        FOREIGN KEY(product_id) REFERENCES product(product_id),
        FOREIGN KEY(ingredient_id) REFERENCES ingredients(ingredient_id)
);

CREATE TABLE IF NOT EXISTS order2product(
    order_id INT NOT NULL,
    product_id INT NOT NULL,
    PRIMARY KEY(order_id, product_id),
    FOREIGN KEY(order_id) REFERENCES user_order(order_id),
    FOREIGN KEY(product_id) REFERENCES product(product_id)
);