package com.company;

public class ChickenPizzaDecorator extends PizzaDecorator{

    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    String addChicken(){
        return "with chicken. ";
    }

    @Override
    public String makePizza() {
        return super.makePizza()+addChicken();
    }
}
