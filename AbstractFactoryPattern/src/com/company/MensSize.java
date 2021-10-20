package com.company;

public class MensSize implements Size{
    public MensSize(int size1){
        System.out.println("selected with size:"+size1);
    }

    @Override
    public String getID() {
        return "Men's size";
    }
}
