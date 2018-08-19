package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegetablesDecorator extends AbstractPizzaOrderDecorator {
    public VegetablesDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(10));
    }

    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + " + vegetables";
    }
}
