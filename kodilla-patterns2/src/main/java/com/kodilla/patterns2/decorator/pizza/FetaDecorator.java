package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FetaDecorator extends AbstractPizzaOrderDecorator{
    public FetaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("8"));
    }

    @Override
    public String bakePizza() {
        return super.bakePizza() + " Greek pizza!";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with feta";
    }
}
