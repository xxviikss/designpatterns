package com.company;

public class Main {

    public static void main(String[] args) {
    EventPlanner eventPlanner= new EventPlanner();

    eventPlanner.addEvent("TEDx talks");
    eventPlanner.addEvent("24-hour film festival");

    EventGuest guest= new EventGuest("Mike");
    eventPlanner.registerObserver(guest);

    eventPlanner.addEvent("Music Legend Memorial Concert");

    eventPlanner.removeEvent("24-hour film festival");
    }
}
