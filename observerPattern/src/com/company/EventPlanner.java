package com.company;

import java.util.List;
import java.util.ArrayList;

public class EventPlanner implements Observable{
    private List<String> events= new ArrayList<>();
    private List<Observer> eventGuests = new ArrayList<>();

    public void addEvent(String event) {
       events.add(event);
        notifyAllObservers();
    }

    public void removeEvent(String event) {
        events.remove(event);
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        eventGuests.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        eventGuests.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer eventGuest : eventGuests) {
            eventGuest.update(this.events);
        }
    }
}