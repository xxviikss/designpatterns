package com.company;

public class NotForRent implements RentBehavior{
    @Override
    public void renting(){
        System.out.println("I will not rent");
    }
}