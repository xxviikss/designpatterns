package com.company;

public class TypeCToUsbAdapter implements USB{

    private PhoneMemory phoneMemory;
    public TypeCToUsbAdapter(PhoneMemory phoneMemory){
        this.phoneMemory= phoneMemory;
    }
    @Override
    public void connectWithUsbCable() {
        this.phoneMemory.connect();
    }
}
