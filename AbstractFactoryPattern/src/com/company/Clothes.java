package com.company;

public class Clothes implements ChoosingThings{

    public Clothes (Type type){
        System.out.println("clothes were selected with type:"+type);
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
        System.out.println("clothes were selected with size:"+size);

    }
}
