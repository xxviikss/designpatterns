package com.company;

import java.util.List;

public class EventGuest implements Observer{

    private String name;

    public EventGuest(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> events) {
        System.out.println("Dear, " + this.name + "\nWe have some changes in events:\n" + events + "\n");
    }
}