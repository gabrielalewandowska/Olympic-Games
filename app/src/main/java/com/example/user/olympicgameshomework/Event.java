package com.example.user.olympicgameshomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class Event<T> {
    EventType eventType;
    int numberOfCompetitors;
    ArrayList<T> competitors;

    public Event(EventType eventType, int numberOfCompetitors) {
        this.eventType = eventType;
        this.numberOfCompetitors = numberOfCompetitors;
        this.competitors = new ArrayList<>();
    }

    public EventType getEventType() {
        return eventType;
    }

    public int getNumberOfCompetitors() {
        return numberOfCompetitors;
    }

    public ArrayList<T> getCompetitors() {
        return competitors;
    }

    public void addCompetitors(T competitor){
        this.competitors.add(competitor);
    }



}
