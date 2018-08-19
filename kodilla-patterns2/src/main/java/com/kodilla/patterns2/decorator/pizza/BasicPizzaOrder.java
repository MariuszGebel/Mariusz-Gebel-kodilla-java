package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getPizzaCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getPizzaDescription() {
        return "Basic pizza";
    }
}
