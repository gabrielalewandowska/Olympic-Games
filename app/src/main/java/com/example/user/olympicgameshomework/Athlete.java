package com.example.user.olympicgameshomework;

import android.support.annotation.NonNull;

/**
 * Created by user on 15/09/2017.
 */

public class Athlete extends Competitor {
    private String name;


    public Athlete(String name, Country country) {
        super(country);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Competitor otherCompetitor){
        if(this.getScore() == otherCompetitor.getScore()){
            return 0;
        } else {
            return getScore() > otherCompetitor.getScore()? 1 : -1;
        }
    }


}
