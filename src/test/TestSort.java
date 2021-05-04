package test;

import model.AthleticsCompetition;
import model.Competitor;
import model.JsonUtilities;
import model.ModelConstants;

import java.util.*;

public class TestSort {

    public static void main(String[] args) {
        AthleticsCompetition competition = new AthleticsCompetition();
        competition.fillDelegations(JsonUtilities.readJson(ModelConstants.PATH_JSON));
        ArrayList<Competitor> list = competition.getListCompetitorByCompetenceFemale("Disco");
        Collections.sort(list, Comparator.comparing(Competitor:: getDateOfBirth).reversed());
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i).getDateOfBirth());
        }
    }
}
