package com.company;

public class Shoes implements ChoosingThings{

    public Shoes(Type type){
        System.out.println("shoes were selected with type:"+type);
    }

    @Override
    public void makingAnOrder() {
        System.out.println("making an order");
    }

    @Override
    public void delivery() {
        System.out.println("the order has been delivered");
    }

    @Override
    public void chooseSize(Size size) {
        System.out.println("shoes were selected with size:"+size);

    }
}
