package com.example.user.olympicgameshomework;

/**
 * Created by user on 15/09/2017.
 */

public abstract class Competitor {
    Country country;
    int score;
    Medal medal;

    public Competitor(Country country, int score, Medal medal) {
        this.country = country;
        this.score = score;
        this.medal = medal;
    }

    public Country getCountry() {
        return country;
    }

    public int getScore() {
        return score;
    }

    public Medal getMedal() {
        return medal;
    }



}
