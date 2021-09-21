package com.company;

public class ApartmentSearch extends Search{
    public ApartmentSearch(){ super(new LongTermRent(),new NotForBuy() {});
    }


    @Override
    public void display(){
        System.out.println("I'm looking for an apartment");
    }
}