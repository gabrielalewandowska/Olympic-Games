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
    ArrayList<Competitor> rankedCompetitors;

    public Event(Sport sportType, int maximumNumberOfCompetitors) {
        this.sportType = sportType;
        this.maximumNumberOfCompetitors = maximumNumberOfCompetitors;
        this.competitors = new ArrayList<>();
        rankedCompetitors = new ArrayList<>();
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

    public ArrayList<Competitor> getRankedCompetitors() {
        return rankedCompetitors;
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

    public void rankCompetitors(){
        rankedCompetitors = competitors;
        Collections.sort(rankedCompetitors);
        Collections.reverse(rankedCompetitors);
    }

    public void awardMedals(){
        rankedCompetitors.get(0).awardMedal(MedalType.GOLD);
        rankedCompetitors.get(1).awardMedal(MedalType.SILVER);
        rankedCompetitors.get(2).awardMedal(MedalType.BRONZE);
    }



}
