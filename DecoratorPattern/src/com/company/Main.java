package com.company;

public class Main {

    public static void main(String[] args) {
    Pizza pizza= new MozzarellaPizzaDecorator(new ChickenPizzaDecorator(new BasePizza()));

     System.out.println(pizza.makePizza());
    }
}
