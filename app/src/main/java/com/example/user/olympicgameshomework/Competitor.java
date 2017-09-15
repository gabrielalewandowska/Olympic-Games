package com.example.user.olympicgameshomework;

import java.util.HashMap;

/**
 * Created by user on 15/09/2017.
 */

public abstract class Competitor {
    private Country country;
    private int score;
    private HashMap medal;

    public Competitor(Country country) {
        this.country = country;
        this.score = 0;
        this.medal = new HashMap();
        this.medal.put("gold", 0);
        this.medal.put("silver", 0);
        this.medal.put("bronze", 0);
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



}
