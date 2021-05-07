package test;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMedals {

    public static void main(String[] args) {
        AthleticsCompetition competition = new AthleticsCompetition();
        competition.fillDelegations(JsonUtilities.readJson(ModelConstants.PATH_JSON));
        competition.setMedalByCompetenceFemale();
        competition.setMedalByCompetenceMale();
        ArrayList<Delegation> delegations = competition.getDelegations();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> temp = delegations.get(i).getCompetitors();
            for (int j=0; j<temp.size(); j++){
                if (temp.get(j).getMedal() != null && temp.get(j).getCompetence().getNameCompetence().equals(ModelConstants.LONG_JUMP)){
                    System.out.println(Arrays.toString(temp.get(j).getCompetitorInfoForSearch()) + temp.get(j).getTimeResult());
                }
            }

        }
        for (int i=0; i<delegations.size(); i++){
            System.out.println(delegations.get(i).getOriginPlace());
            System.out.println(Arrays.toString(competition.medalForDelegation(delegations.get(i).getOriginPlace())));
        }
    }
}
