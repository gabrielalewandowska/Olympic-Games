package com.example.user.olympicgameshomework;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by user on 15/09/2017.
 */

public class EventTest {
    Event teamEvent;
    Event athleteEvent;
    Team team1;
    Team team2;
    Team team3;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;

    @Before
    public void before(){
        teamEvent = new Event(Sport.FIGURESKATING, 2);
        athleteEvent = new Event(Sport.FIGURESKATING, 3);
        team1 = new Team(Country.RUSSIA);
        team2 = new Team(Country.USA);
        team3 = new Team(Country.FRANCE);
        athlete1 = new Athlete("Tatiana Navka", Country.RUSSIA);
        athlete2 = new Athlete("Roman Kostomarov", Country.RUSSIA);
        athlete3 = new Athlete("John Weir", Country.USA);
    }

    @Test
    public void canGetSport(){
        assertEquals(Sport.FIGURESKATING, teamEvent.getEventType());
    }

    @Test
    public void canGetNumberOfCompetitors() {
        assertEquals(2, teamEvent.getMaximumNumberOfCompetitors());
    }

    @Test
    public void startsWithoutCompetitors(){
        assertEquals(0, teamEvent.getCompetitors().size());
    }

    @Test
    public void canAddCompetitors(){
        teamEvent.addCompetitor(team1);
        assertEquals(team1, teamEvent.getCompetitors().get(0));
    }

    @Test
    public void cannotAddMoreCompetitorsThanMaxNumber(){
        teamEvent.addCompetitor(team1);
        teamEvent.addCompetitor(team2);
        teamEvent.addCompetitor(team3);
        assertEquals(2, teamEvent.getCompetitors().size());
        assertEquals(team1, teamEvent.getCompetitors().get(0));
        assertEquals(team2, teamEvent.getCompetitors().get(1));
    }

//    @Test
//    public void canAssignScoreToCompetitor(){
//        athleteEvent.addCompetitor(athlete1);
//        athleteEvent.addCompetitor(athlete2);
//        athleteEvent.addCompetitor(athlete3);
//        athleteEvent.assignScoreToCompetitors();
//
//        assertEquals(3 , athlete3.getScore());
//
//    }


}
