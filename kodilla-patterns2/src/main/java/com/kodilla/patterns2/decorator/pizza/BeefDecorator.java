package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BeefDecorator extends AbstractPizzaOrderDecorator{
    public BeefDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("15"));
    }

    @Override
    public String bakePizza() {
        return super.bakePizza() + " Super supreme pizza!";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with beef";
    }
}
