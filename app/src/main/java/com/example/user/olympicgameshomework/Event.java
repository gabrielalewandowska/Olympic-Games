package com.example.user.olympicgameshomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by user on 15/09/2017.
 */

public class Event {
    Sport sportType;
    int maximumNumberOfCompetitors;
    ArrayList<Competitor> competitors;
    ArrayList<Competitor> orderedCompetitors;

    public Event(Sport sportType, int maximumNumberOfCompetitors) {
        this.sportType = sportType;
        this.maximumNumberOfCompetitors = maximumNumberOfCompetitors;
        this.competitors = new ArrayList<>();
        orderedCompetitors = new ArrayList<>();
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

    public void addCompetitor(Competitor competitor){
        if(this.competitors.size() < this.maximumNumberOfCompetitors) {
            this.competitors.add(competitor);
        }
    }


    public void assignScoreToCompetitors(){
        Random random = new Random();
        for(int i = 0; i < this.competitors.size(); i++){
            this.competitors.get(i).setScore(random.nextInt(100));
        }
    }

    public void awardMedals(){
        Collections.sort(competitors);
        Collections.reverse(competitors);
    }



}
