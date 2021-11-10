package com.company;

public class Traingle extends Shape{
        public Traingle(Color color){
            super(color);
        }
        @Override
        public void draw() {
            color.colorOfShape();
            System.out.println("traingle");

        }
}
