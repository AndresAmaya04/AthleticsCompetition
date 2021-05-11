package test;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMedals {

    public static void main(String[] args) {
        JsonUtilities jsonUtilities = new JsonUtilities();
        AthleticsCompetition competition = new AthleticsCompetition();
        competition.fillDelegations(jsonUtilities.readJson());
        competition.setMedalByCompetenceFemale();
        competition.setMedalByCompetenceMale();
        ArrayList<Delegation> delegations = competition.getDelegations();
        ArrayList<Competitor> competitors = competition.extractGoldWinners();
        competitors.addAll(competition.extractSilverWinners());
        competitors.addAll(competition.extractBronzeWinners());
        for (int i=0; i<competitors.size(); i++){
            System.out.println(Arrays.toString(competitors.get(i).getCompetitorInfoForMedals()));
        }
    }
}
