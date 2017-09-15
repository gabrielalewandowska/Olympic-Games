package com.example.user.olympicgameshomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class Event<T> {
    Sport sportType;
    int numberOfCompetitors;
    ArrayList<T> competitors;

    public Event(Sport sportType, int numberOfCompetitors) {
        this.sportType = sportType;
        this.numberOfCompetitors = numberOfCompetitors;
        this.competitors = new ArrayList<>();
    }

    public Sport getEventType() {
        return sportType;
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
