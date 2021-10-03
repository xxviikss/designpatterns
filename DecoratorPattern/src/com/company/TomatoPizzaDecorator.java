package com.company;

public class TomatoPizzaDecorator extends PizzaDecorator{

    public TomatoPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    String addTomato(){
        return "with tomato. ";
    }

    @Override
    public String makePizza() {
        return super.makePizza()+addTomato();
    }
}
