package com.company;

public class MozzarellaPizzaDecorator extends PizzaDecorator{

    public MozzarellaPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    String addMozzarella(){
        return "with mozzarella. ";
    }

    @Override
    public String makePizza() {
        return super.makePizza()+ addMozzarella();
    }
}
