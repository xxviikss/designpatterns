package com.company;

public class PrivateHouseSearch extends Search{
    public PrivateHouseSearch(){
        super(new NotForRent(),new PurchaseOfNewBuilding());
    }


    @Override
    public void display(){
        System.out.println("I'm looking for a private house");
    }
}