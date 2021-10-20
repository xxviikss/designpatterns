package com.company;

public interface ChoosingThings {
    enum Type{kids,adults}

    void makingAnOrder();
    void delivery();
    void chooseSize(Size size);
}
