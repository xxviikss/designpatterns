package com.company;

public class WomensSize implements Size{
    public WomensSize(int size2){
    System.out.println("selected with size:"+size2);
}

    @Override
    public String getID() {
        return "Women's size";
    }
}
