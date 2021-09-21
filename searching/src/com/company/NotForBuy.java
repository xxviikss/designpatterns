package com.company;

public class NotForBuy implements PurchaseBehavior{
    @Override
    public void purchasing(){
        System.out.println("I will not buy");}
}