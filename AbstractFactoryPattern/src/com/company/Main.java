package com.company;

public class Main {

    public static void main(String[] args) {
	ResourceFactory factory = new ClothesFactory();

	ChoosingThings things=factory.createChoosingThings(ChoosingThings.Type.adults);
	Size size= factory.createSize(44);
	things.chooseSize(size);

	things.makingAnOrder();
	things.delivery();
    }
}
