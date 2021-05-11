package presenter;

import model.*;
import views.main.JfMainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Presenter implements ActionListener {

    JfMainWindow jfMainWindow;
    JsonUtilities jsonUtilities;
    AthleticsCompetition athleticsCompetition;

    public Presenter() {
        jfMainWindow = new JfMainWindow(this);
        jsonUtilities = new JsonUtilities();
        athleticsCompetition = new AthleticsCompetition();
    }

    public static void main(String[] args) {
        new  Presenter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Command.valueOf( e.getActionCommand())) {
            case C_ADD_JSON:
                addDoc();
                break;
            case C_ADD_RUNNER:
                break;
            case C_CHANGE_SPANISH:
                break;
            case C_CHANGE_ENGLISH:
                break;
            case C_INFO_RUNNER:
                jfMainWindow.changePanelFindCompetitor();
                break;
            case C_MEDALS_DELEGATIONS:
                break;
            case C_SCHEDULE_PER_COMPETENCE:
                break;
            case C_LIST_COMPETITOR:
                jfMainWindow.changePanelCompetitorsDelegation();
                break;
            case C_SCHEDULE:
                break;
            case C_GENERAL_RESULTS:
                jfMainWindow.changePanelScore();
                break;
            case C_GOLDS:
                jfMainWindow.changePanelMedalsCompetenceGold();
                break;
            case C_SILVERS:
                jfMainWindow.changePanelMedalsCompetenceSilver();
                break;
            case C_BRONZE:
                jfMainWindow.changePanelMedalsCompetenceBronze();
                break;
            case C_BAR_GRAPHIC:
                break;
            case SEARCH_INFO_COMPETITOR:
                jfMainWindow.cleanTableFindCompetitor();
                ArrayList<Object[]> competitors = athleticsCompetition.findCompetitor(jfMainWindow.getNameFindCompetitor());
                for (int i=0; i<competitors.size(); i++){
                    jfMainWindow.addRowToFindCompetitor(competitors.get(i));
                }
                break;
            case SEARCH_DELEGATION_LIST:
                jfMainWindow.cleanTableByDelegation();
                ArrayList<Object[]> competitorsDelegation = athleticsCompetition.getListOfCompetitorsByDelegation(jfMainWindow.getNameByDelegationSearch());
                for (Object[] competitor: competitorsDelegation){
                    jfMainWindow.addRowTableByDelegation(competitor);
                }
                break;
            case LIST_GOLDS:
                jfMainWindow.cleanTableGold();
                ArrayList<Competitor> competitorsGold = athleticsCompetition.extractGoldWinners();
                for (Competitor competitor: competitorsGold){
                    jfMainWindow.addRowGold(competitor.getCompetitorInfoForMedals());
                }
                break;
            case LIST_SILVERS:
                jfMainWindow.cleanTableSilver();
                ArrayList<Competitor> competitorsSilver = athleticsCompetition.extractSilverWinners();
                for (Competitor competitor: competitorsSilver){
                    jfMainWindow.addRowSilver(competitor.getCompetitorInfoForMedals());
                }
                break;
            case LIST_BRONZES:
                jfMainWindow.cleanTableBronze();
                ArrayList<Competitor> competitorsBronze = athleticsCompetition.extractBronzeWinners();
                for (Competitor competitor: competitorsBronze){
                    jfMainWindow.addRowBronze(competitor.getCompetitorInfoForMedals());
                }
                break;
            case SCORE_BUTTON:
                jfMainWindow.cleanPanelScores();
                ArrayList<Competitor> competitorsScore = athleticsCompetition.getOrderOfCompetition(jfMainWindow.getCompetenceComboBoxScores(), jfMainWindow.getGenderBoxScore());
                for (int i=0; i<competitorsScore.size(); i++){
                    Object[] info = new Object[]{i+1, null, null, null, null, null, null};
                    System.arraycopy(competitorsScore.get(i).getCompetitorInfoPanelScores(), 0, info, 1, competitorsScore.get(i).getCompetitorInfoPanelScores().length);
                    jfMainWindow.addRowScores(info);
                }
                break;
            default:
                break;
        }
    }

    public void addDoc(){
        String auxPath = jfMainWindow.filechooser();
        String auxPathDoc2 = jfMainWindow.filechooser();
        jsonUtilities.setPathCompetences(auxPathDoc2);
        athleticsCompetition.fillDelegations(jsonUtilities.readJson(auxPath));
        athleticsCompetition.setMedalByCompetenceMale();
        athleticsCompetition.setMedalByCompetenceFemale();
        athleticsCompetition.setMedalsToAllDelegations();
    }
}
