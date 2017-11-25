package com.example.user.olympicgameshomework;

import java.util.HashMap;

/**
 * Created by user on 16/09/2017.
 */

public class MedalTable {
    private HashMap<Country, HashMap<MedalType, Integer>> ranking;

    public MedalTable() {
        this.ranking = new HashMap<>();

        for(Country country : Country.values()){
            this.ranking.put(country, new HashMap<MedalType, Integer>());
                for (MedalType medal : MedalType.values()){
                    this.ranking.get(country).put(medal, 0);
                }
            }
        }


    public HashMap<Country, HashMap<MedalType, Integer>> getRanking() {
        return ranking;
     }

     public void updateRanking(Country country, MedalType medalType){
         int currentMedalCount = this.ranking.get(country).get(medalType);
         this.ranking.get(country).put(medalType, currentMedalCount + 1);
     }

    public void updateMainMedalTable(Event event){
        MedalTable eventMedalTable = event.getMedalTable();
        HashMap<Country, HashMap<MedalType, Integer>> currentMedals = this.ranking;

        for(Country country : Country.values()){
            event.getMedalTable().getRanking().get(country);
            for(MedalType medal : MedalType.values()){
                this.ranking.get(country).put(medal, currentMedals.get(country).get(medal) +
                eventMedalTable.getRanking().get(country).get(medal) );
            }
        }
    }


}



