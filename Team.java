package com.example.user.olympicgameshomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class Team extends Competitor {
    private ArrayList<Athlete> teamMembers;

    public Team(Country country) {
        super(country);
        teamMembers = new ArrayList<>();
    }

    public ArrayList<Athlete> getTeamMembers() {
        return teamMembers;
    }
}
