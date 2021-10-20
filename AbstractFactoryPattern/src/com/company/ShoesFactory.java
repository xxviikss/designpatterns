package com.company;

public class ShoesFactory implements ResourceFactory{


    @Override
    public ChoosingThings createChoosingThings(ChoosingThings.Type type) {
        return new Shoes(type);
    }

    @Override
    public Size createSize(int size) {
        return new WomensSize(size);
    }
}
