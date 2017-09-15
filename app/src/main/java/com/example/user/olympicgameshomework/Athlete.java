package com.example.user.olympicgameshomework;

/**
 * Created by user on 15/09/2017.
 */

public class Athlete extends Competitor {
    String name;

    public Athlete(String name, Country country, int score, Medal medal) {
        super(country, score, medal);
        this.name = name;
    }
}
