package com.example.user.olympicgameshomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 16/09/2017.
 */

public class MedalTableTest {
    MedalTable medalTable;
    Event event;
    Event event2;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;

    @Before
    public void before(){
        medalTable = new MedalTable();
        event = new Event(Sport.FIGURESKATING, 4);
        event2 = new Event(Sport.ALPINESKIING, 3);
        athlete1 = new Athlete("Tatiana Navka", Country.RUSSIA);
        athlete2 = new Athlete("Roman Kostomarov", Country.RUSSIA);
        athlete3 = new Athlete("John Weir", Country.USA);
        athlete4= new Athlete("Brian Joubert", Country.FRANCE);

    }

//    @Test
//    public void canGetRanking(){
//        assertEquals(1, medalTable.getRanking());
//    }

//    @Test
//    public void medalTableGetsUpdated(){
//        event.addCompetitor(athlete1);
//        event.addCompetitor(athlete2);
//        event.addCompetitor(athlete3);
//        event.addCompetitor(athlete4);
//        event.assignScoreToCompetitors();
//          event.setCompetitorScore(0, 100)
//        event.rankCompetitors();
//        event.awardMedals();
//        assertEquals(1, event.getMedalTable().getRanking());
//
//    }

//    @Test
//    public void mainMedalTableGetsUpdated(){
//        event.addCompetitor(athlete1);
//        event.addCompetitor(athlete2);
//        event.addCompetitor(athlete3);
//
//        event2.addCompetitor(athlete1);
//        event2.addCompetitor(athlete2);
//        event2.addCompetitor(athlete4);
//
//        event.assignScoreToCompetitors();
//        event.rankCompetitors();
//        event.awardMedals();
//
//        event2.assignScoreToCompetitors();
//        event2.rankCompetitors();
//        event2.awardMedals();
//
//        medalTable.updateMainMedalTable(event);
//        medalTable.updateMainMedalTable(event2);
//
//        assertEquals(1, medalTable.getRanking());
//    }
}
