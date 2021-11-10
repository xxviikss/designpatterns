package com.company;

public class Main {

    public static void main(String[] args) {

        USB adapter= new TypeCToUsbAdapter(new PhoneMemory());
        adapter.connectWithUsbCable();
    }
}
