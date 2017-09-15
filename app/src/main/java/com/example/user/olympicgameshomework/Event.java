package com.example.user.olympicgameshomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class Event {
    Sport sportType;
    int maximumNumberOfCompetitors;
    ArrayList<Competitor> competitors;

    public Event(Sport sportType, int maximumNumberOfCompetitors) {
        this.sportType = sportType;
        this.maximumNumberOfCompetitors = maximumNumberOfCompetitors;
        this.competitors = new ArrayList<>();
    }

    public Sport getEventType() {
        return sportType;
    }

    public int getMaximumNumberOfCompetitors() {
        return maximumNumberOfCompetitors;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    public void addCompetitors(Competitor competitor){
        this.competitors.add(competitor);
    }



}
