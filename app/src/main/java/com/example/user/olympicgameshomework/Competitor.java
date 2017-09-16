package com.example.user.olympicgameshomework;

import java.util.HashMap;

/**
 * Created by user on 15/09/2017.
 */

public abstract class Competitor implements Comparable<Competitor> {
    private Country country;
    private int score;
    private HashMap<MedalType,Integer> medal;

    public Competitor(Country country) {
        this.country = country;
        this.score = 0;
        this.medal = new HashMap();
        this.medal.put(MedalType.GOLD, 0);
        this.medal.put(MedalType.SILVER, 0);
        this.medal.put(MedalType.BRONZE, 0);
    }

    public Country getCountry() {
        return country;
    }

    public int getScore() {
        return score;
    }

    public HashMap getMedal() {
        return medal;
    }

    public void awardMedal(MedalType medal){
        int currentMedalNumber = this.medal.get(medal);
        if (medal == MedalType.GOLD){
            this.medal.put(MedalType.GOLD, currentMedalNumber +1);
        } else if (medal == MedalType.SILVER){
            this.medal.put(MedalType.SILVER, currentMedalNumber +1);
        } else {
            this.medal.put(MedalType.BRONZE, currentMedalNumber +1);
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int compareTo(Competitor otherCompetitor){
        if(this.getScore() == otherCompetitor.getScore()){
            return 0;
        } else if(this.getScore() > otherCompetitor.getScore()) {
            return 1;
        } else {
        return -1;
    }
    }

}
