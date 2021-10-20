package com.company;

public class ClothesFactory implements ResourceFactory{


    @Override
    public ChoosingThings createChoosingThings(ChoosingThings.Type type) {
        return new Clothes(type);
    }

    @Override
    public Size createSize(int size) {
        return new MensSize(size);
    }
}
