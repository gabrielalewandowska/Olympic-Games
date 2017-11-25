package com.example.user.olympicgameshomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/09/2017.
 */

public class AthleteTest {
    Athlete athlete1;

    @Before
    public void before(){
        athlete1 = new Athlete("Evgeny Plushenko", Country.RUSSIA);
    }

    @Test
    public void canGetName(){
        assertEquals("Evgeny Plushenko", athlete1.getName());
    }

    @Test
    public void canGetCountry(){
        assertEquals(Country.RUSSIA, athlete1.getCountry());
    }

    @Test
    public void canGetScore(){
        assertEquals(0, athlete1.getScore());
    }

    @Test
    public void startsWith0Medals(){
        assertEquals(0, athlete1.getMedal().get(MedalType.GOLD));
        assertEquals(0, athlete1.getMedal().get(MedalType.SILVER));
        assertEquals(0, athlete1.getMedal().get(MedalType.BRONZE));
    }

    @Test
    public void canAwardMedalGold(){
        athlete1.awardMedal(MedalType.GOLD);
        athlete1.awardMedal(MedalType.GOLD);
        assertEquals(2, athlete1.getMedal().get(MedalType.GOLD));
        assertEquals(0, athlete1.getMedal().get(MedalType.SILVER));
        assertEquals(0, athlete1.getMedal().get(MedalType.BRONZE));

    }

    @Test
    public void canAwardMedalSilver(){
        athlete1.awardMedal(MedalType.SILVER);
        assertEquals(0, athlete1.getMedal().get(MedalType.GOLD));
        assertEquals(1, athlete1.getMedal().get(MedalType.SILVER));
        assertEquals(0, athlete1.getMedal().get(MedalType.BRONZE));
    }

    @Test
    public void canAwardMedalBronze(){
        athlete1.awardMedal(MedalType.BRONZE);
        assertEquals(0, athlete1.getMedal().get(MedalType.GOLD));
        assertEquals(0, athlete1.getMedal().get(MedalType.SILVER));
        assertEquals(1, athlete1.getMedal().get(MedalType.BRONZE));
    }
}
