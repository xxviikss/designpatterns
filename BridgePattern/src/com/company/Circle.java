package com.company;

public class Circle extends Shape{
    public Circle(Color color){
        super(color);
    }
    @Override
    public void draw() {
        color.colorOfShape();
        System.out.println("circle");

    }
}
