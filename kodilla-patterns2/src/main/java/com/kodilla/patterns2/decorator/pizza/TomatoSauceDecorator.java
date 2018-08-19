package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoSauceDecorator extends AbstractPizzaOrderDecorator {
    public TomatoSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(2));
    }

    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + " tomato sauce";
    }
}
